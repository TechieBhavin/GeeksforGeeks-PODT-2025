<h2><a href="https://www.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1">Longest Subarray with Sum K

</a></h2>  <img src='https://img.shields.io/badge/Difficulty-Medium-orange' alt='Difficulty: Medium' /><hr>

<p>Given an array arr[] containing integers and an integer k, your task is to find the length of the longest subarray where the sum of its elements is equal to the given value k. If there is no subarray with sum equal to k, return 0.</p>


<b>Examples:</b>

<pre>
<b>Input:</b> arr[] = [10, 5, 2, 7, 1, -10], k = 15
<b>Output:</b> 6
<b>Explanation:</b> Subarrays with sum = 15 are [5, 2, 7, 1], [10, 5] and [10, 5, 2, 7, 1, -10]. The length of the longest subarray with a sum of 15 is 6.
</pre>

<pre>
<b>Input:</b> arr[] = [-5, 8, -14, 2, 4, 12], k = -5
<b>Output:</b> 5
<b>Explanation:</b> Only subarray with sum = 15 is [-5, 8, -14, 2, 4] of length 5.
</pre>

<pre>
<b>Input:</b> arr[] = [10, -10, 20, 30], k = 5
<b>Output:</b> 0
<b>Explanation:</b> No subarray with sum = 5 is present in arr[].
</pre>













