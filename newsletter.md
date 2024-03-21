---
layout: home
permalink: /made/
---
<div class="boxes">

<div class="box box2">

letters unfold truths

whimsy amidst vast insights

minds bloom, stars align

</div>

If the [feed](/feed.xml) doesn't tickle your fancy (or you just don't use RSS readers), feel free to subscribe to my newsletter. I'll send you an email whenever I post something new. No spam, I promise.


<h2>Signup Form</h2>
<form id="signupForm">
    <label for="name">Name:</label><br>
    <input type="text" id="name" name="name" required><br>
    <label for="email">Email:</label><br>
    <input type="email" id="email" name="email" required><br><br>
    <input type="submit" value="Submit">
</form>

<script>
    document.getElementById('signupForm').addEventListener('submit', async (event) => {
        event.preventDefault(); // Prevent the form from submitting the traditional way
        
        const formData = new FormData(event.target);
        const response = await fetch('https://signups.uys.io/', {
            method: 'POST',
            body: formData
        });

        if (response.ok) {
            window.location.href = '/thanks';
            // document.body.innerHTML = '<p>Thanks!</p>';
        } else {
            // Handle submission error
            alert('That didn\'t work :(');
        }
    });
</script>


{% for i in (1..30) %}

<div class="box"></div>

{% endfor %}


</div>
