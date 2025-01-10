<h2><a href="https://www.geeksforgeeks.org/problems/count-distinct-elements-in-every-window/1">Count distinct elements in every window
</a></h2> <img src='https://img.shields.io/badge/Difficulty-Easy-brightgreen' alt='Difficulty: Easy' /><hr>

<p>Given an integer array arr[] and a number k. Find the count of distinct elements in every window of size k in the array.</p>


<b>Examples:</b>

<pre>
<b>Input:</b> arr[] = [1, 2, 1, 3, 4, 2, 3], k = 4
<b>Output:</b> [3, 4, 4, 3]
<b>Explanation:</b> Window 1 of size k = 4 is 1 2 1 3. Number of distinct elements in this window are 3. 
Window 2 of size k = 4 is 2 1 3 4. Number of distinct elements in this window are 4.
Window 3 of size k = 4 is 1 3 4 2. Number of distinct elements in this window are 4.
Window 4 of size k = 4 is 3 4 2 3. Number of distinct elements in this window are 3.
</pre>

<pre>
<b>Input:</b> arr[] = [4, 1, 1], k = 2
<b>Output:</b> [2, 1]
<b>Explanation:</b> Window 1 of size k = 2 is 4 1. Number of distinct elements in this window are 2. 
Window 2 of size k = 2 is 1 1. Number of distinct elements in this window is 1. 
</pre>

<pre>
<b>Input:</b> arr[] = [1, 1, 1, 1, 1], k = 3
<b>Output:</b> [1, 1, 1]
</pre><hr>




