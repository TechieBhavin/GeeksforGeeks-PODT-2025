<h2><a href="https://www.geeksforgeeks.org/problems/pair-in-array-whose-sum-is-closest-to-x1124/1">Sum Pair closest to target

</a></h2>  <img src='https://img.shields.io/badge/Difficulty-Medium-orange' alt='Difficulty: Medium' /><hr>

<p>Given an array arr[] and a number target, find a pair of elements (a, b) in arr[], where a<=b whose sum is closest to target.</p>
<b>Note:</b><p>Return the pair in sorted order and if there are multiple such pairs return the pair with maximum absolute difference. If no such pair exists return an empty array.</p>


<b>Examples:</b>

<pre>
<b>Input:</b> arr[] = [10, 30, 20, 5], target = 25
<b>Output:</b> [5, 20]
<b>Explanation:</b> As 5 + 20 = 25 is closest to 25.
</pre>

<pre>
<b>Input:</b> arr[] = [5, 2, 7, 1, 4], target = 10
<b>Output:</b> [2, 7]
<b>Explanation:</b> As (4, 7) and (2, 7) both are closest to 10, but absolute difference of (2, 7) is 5 and (4, 7) is 3. Hence, [2, 7] has maximum absolute difference and closest to target. 
</pre>

<pre>
<b>Input:</b> arr[] = [10], target = 10
<b>Output:</b> []
<b>Explanation:</b> As the input array has only 1 element, return an empty array.
</pre>









