<h2><a href="https://www.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1">Indexes of Subarray Sum

</a></h2>  <img src='https://img.shields.io/badge/Difficulty-Medium-orange' alt='Difficulty: Medium' /><hr>

<p>Given an array arr[] containing only non-negative integers, your task is to find a continuous subarray (a contiguous sequence of elements) whose sum equals a specified value target. You need to return the 1-based indices of the leftmost and rightmost elements of this subarray. You need to find the first subarray whose sum is equal to the target.</p>
<b>Note:</b><p>If no such array is possible then, return [-1].</p>


<b>Examples:</b>

<pre>
<b>Input:</b> arr[] = [1, 2, 3, 7, 5], target = 12
<b>Output:</b> [2, 4]
<b>Explanation:</b> The sum of elements from 2nd to 4th position is 12.
</pre>

<pre>
<b>Input:</b> arr[] = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10], target = 15
<b>Output:</b> [1, 5]
<b>Explanation:</b> The sum of elements from 1st to 5th position is 15.
</pre>

<pre>
<b>Input:</b> arr[] = [5, 3, 4], target = 2
<b>Output:</b> [-1]
<b>Explanation:</b> There is no subarray with sum 2.
</pre>










