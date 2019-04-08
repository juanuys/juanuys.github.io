---
layout: post
title: "Cracking the MI5 puzzle."
description: "Cracking the MI5 puzzle."
tags: [tech,python]
category: blog
---

Cleaning up hard-drive; found some old code.

MI5 put this puzzle on their website. (It's still [there](https://www.mi5.gov.uk/careers/opportunities/technology) - just scroll down):

![MI5 puzzle](/assets/posts/2019-04-08-cracking-the-mi5-puzzle/puzzle.png)

The puzzle screams encoded message, because that's not a picture of anything. I thought that perhaps this might be a ruse, and that something a bit more sophisticated is being used here, e.g. steganography.

Looking at the bitmap data showed clean numbers, i.e. only 2 colours were used, not slightly different shades of two colours (which would hint at stego).

I went back to the first idea, and lo and behold - it's a recruitment drive!

    python main.py

> b'Congratulations, you solved the puzzle! Why don\x92t you apply to join our team? mi5.gov.uk/careers '

Bit underwhelming. <span class="highlight">I fully expected a chopper to land outside in the garden the moment my Python script finished running.</span> A lady clad in black would kick my door down, run over to me, and say in a forceful yet husky voice "The Queen needs you."

Spoiler: Here's the code, but please do try it yourself and experience your own Bond moment (yes, I know he's MI6...):

## main.py

```
from PIL import Image, ImageFont, ImageDraw
import numpy as np

# these values gleaned by looking at the bitmap.
def bi(tup):
    if tup[0] == 58:
        return 1
    elif tup[0] == 232:
        return 0
    else:
        return -1

def ribbon(file_location="puzzle.png"):
    encoded_image = Image.open(file_location)
    im = np.asarray(encoded_image, dtype=np.uint8)
    binarised = [bi(im[i,j]) for i,j in np.ndindex(im.shape[:2])]

    next = binarised[0]
    count = 0
    results = []
    for i in binarised:
        if next == i:
            count = count + 1
        else:
            results.append(count)
            count = 1
        next = i
    results.append(count)

    strung = [(chr(i)) for i in results]
    hex = ''.join(strung)
    hex = hex.replace('-', '')

    decoded = bytes.fromhex(hex)
    print(decoded)

if __name__ == "__main__":
    ribbon()
```

## Pipfile

```
[[source]]
name = "pypi"
url = "https://pypi.org/simple"
verify_ssl = true

[dev-packages]

[packages]
Pillow = "*"
numpy = "*"

[requires]
python_version = "3.7"
```
