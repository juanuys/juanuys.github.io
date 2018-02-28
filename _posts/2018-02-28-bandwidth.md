---
layout: post
title: "Bandwidth."
description: "Bandwidth."
tags: [plato-long,life]
category: blog
---

My 24-hour day as a [parallel port](https://en.wikipedia.org/wiki/Parallel_port).

<pre>
                      ____
                     /    \
   STROBE  <-->  1   | o   \
                     |   o |  14  <-->  Line feed
       D0  <---  2   | o   |
                     |   o |  15  <---  Error
       D1  <---  3   | o   |
                     |   o |  16  <-->  RESET
       D2  <---  4   | o   |
                     |   o |  17  <-->  Select Printer
       D3  <---  5   | o   |
                     |   o |  18  ----  GND
       D4  <---  6   | o   |
                     |   o |  19  ----  GND
       D5  <---  7   | o   |
                     |   o |  20  ----  GND
       D6  <---  8   | o   |
                     |   o |  21  ----  GND
       D7  <---  9   | o   |
                     |   o |  22  ----  GND
      ACK  --->  10  | o   |
                     |   o |  23  ----  GND
     BUSY  --->  11  | o   |
                     |   o |  24  ----  GND
Paper Out  --->  12  | o   |
                     |   o |  25  ----  GND
   Select  --->  13  | o   /
                     \____/
</pre>


<table>
<tbody><tr>
<th>Pin No (DB25)</th>
<th>Signal name</th>
<th>Description</th>
<th>Direction</th>
<th>Register - bit</th>
<th>Inverted</th>
</tr>
<tr>
<td>1</td>
<td>Strobe</td>
<td>Morning routine; breakfast</td>
<td>In/Out</td>
<td>Control-0</td>
<td>Yes</td>
</tr>
<tr>
<td>2</td>
<td>Data0</td>
<td>Work</td>
<td>Out</td>
<td>Data-0</td>
<td>No</td>
</tr>
<tr>
<td>3</td>
<td>Data1</td>
<td>Work</td>
<td>Out</td>
<td>Data-1</td>
<td>No</td>
</tr>
<tr>
<td>4</td>
<td>Data2</td>
<td>Work</td>
<td>Out</td>
<td>Data-2</td>
<td>No</td>
</tr>
<tr>
<td>5</td>
<td>Data3</td>
<td>Work; Lunch</td>
<td>Out</td>
<td>Data-3</td>
<td>No</td>
</tr>
<tr>
<td>6</td>
<td>Data4</td>
<td>Lunch; Work</td>
<td>Out</td>
<td>Data-4</td>
<td>No</td>
</tr>
<tr>
<td>7</td>
<td>Data5</td>
<td>Work</td>
<td>Out</td>
<td>Data-5</td>
<td>No</td>
</tr>
<tr>
<td>8</td>
<td>Data6</td>
<td>Work</td>
<td>Out</td>
<td>Data-6</td>
<td>No</td>
</tr>
<tr>
<td>9</td>
<td>Data7</td>
<td>Work</td>
<td>Out</td>
<td>Data-7</td>
<td>No</td>
</tr>
<tr>
<td>10</td>
<td>Ack</td>
<td>Acknowledge the world; news; email.</td>
<td>In</td>
<td>Status-6</td>
<td>No</td>
</tr>
<tr>
<td>11</td>
<td>Busy</td>
<td>In-between moments; none of your business et cetera.</td>
<td>In</td>
<td>Status-7</td>
<td>Yes</td>
</tr>
<tr>
<td>12</td>
<td>Paper-Out</td>
<td>Tidy up; prepare for the next day; homework</td>
<td>In</td>
<td>Status-5</td>
<td>No</td>
</tr>
<tr>
<td>13</td>
<td>Select</td>
<td>Time with family.</td>
<td>In</td>
<td>Status-4</td>
<td>No</td>
</tr>
<tr>
<td>14</td>
<td>Linefeed</td>
<td>Evening routine; dinner</td>
<td>In/Out</td>
<td>Control-1</td>
<td>Yes</td>
</tr>
<tr>
<td>15</td>
<td>Error</td>
<td>BZZZZ wrong answer. This day is too long already.</td>
<td>In</td>
<td>Status-3</td>
<td>No</td>
</tr>
<tr>
<td>16</td>
<td>Reset</td>
<td>Meditation; reading</td>
<td>In/Out</td>
<td>Control-2</td>
<td>No</td>
</tr>
<tr>
<td>17</td>
<td>Select-Printer</td>
<td>Time with partner.</td>
<td>In/Out</td>
<td>Control-3</td>
<td>Yes</td>
</tr>
<tr>
<td>18-25</td>
<td>Ground</td>
<td>Sleep</td>
<td>-</td>
<td>-</td>
<td>-</td>
</tr>
</tbody></table>
