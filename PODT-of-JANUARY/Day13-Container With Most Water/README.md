<h2><a href="https://www.geeksforgeeks.org/problems/equilibrium-point-1587115620/1">Equilibrium Point

</a></h2>  <img src='https://img.shields.io/badge/Difficulty-Medium-orange' alt='Difficulty: Medium' /><hr>

<p>Given an array of integers arr[], the task is to find the first equilibrium point in the array.</p>
<p>The equilibrium point in an array is an index (0-based indexing) such that the sum of all elements before that index is the same as the sum of elements after it. Return -1 if no such point exists. </p>

<b>Examples:</b>

<pre>
<b>Input:</b> arr[] = [1, 2, 0, 3]
<b>Output:</b> 2
<b>Explanation:</b> 5The sum of left of index 2 is 1 + 2 = 3 and sum on right of index 2 is 0 + 3 = 3.
</pre>

<pre>
<b>Input:</b> arr[] = [1, 1, 1, 1]
<b>Output:</b> -1
<b>Explanation:</b> There is no equilibrium index in the array.
</pre>

<pre>
<b>Input:</b> arr[] = [-7, 1, 5, 2, -4, 3, 0]
<b>Output:</b> 3
<b>Explanation:</b> The sum of left of index 3 is -7 + 1 + 5 = -1 and sum on right of index 3 is -4 + 3 + 0 = -1.
</pre><hr>






