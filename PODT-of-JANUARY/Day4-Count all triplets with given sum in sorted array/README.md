<h2><a href="https://www.geeksforgeeks.org/problems/count-all-triplets-with-given-sum-in-sorted-array/1">Count all triplets with given sum in sorted array

</a></h2>  <img src='https://img.shields.io/badge/Difficulty-Medium-orange' alt='Difficulty: Medium' /><hr>

<p>Given a sorted array arr[] and a target value, the task is to count triplets (i, j, k) of valid indices, such that arr[i] + arr[j] + arr[k] = target and i < j < k.</p>


<b>Examples:</b>

<pre>
<b>Input:</b> arr[] = [-3, -1, -1, 0, 1, 2], target = -2
<b>Output:</b> 4
<b>Explanation:</b> Two triplets that add up to -2 are:
arr[0] + arr[3] + arr[4] = (-3) + 0 + (1) = -2
arr[0] + arr[1] + arr[5] = (-3) + (-1) + (2) = -2
arr[0] + arr[2] + arr[5] = (-3) + (-1) + (2) = -2
arr[1] + arr[2] + arr[3] = (-1) + (-1) + (0) = -2
</pre>

<pre>
<b>Input:</b> arr[] = [-2, 0, 1, 1, 5], target = 1
<b>Output:</b> 0
<b>Explanation:</b> There is no triplet whose sum is equal to 1. 
</pre>








