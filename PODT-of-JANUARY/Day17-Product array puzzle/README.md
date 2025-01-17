<h2><a href="https://www.geeksforgeeks.org/problems/product-array-puzzle4525/1">Product array puzzle

</a></h2> <img src='https://img.shields.io/badge/Difficulty-Easy-brightgreen' alt='Difficulty: Easy' /><hr>

<p>Given an array, arr[] construct a product array, res[] where each element in res[i] is the product of all elements in arr[] except arr[i]. Return this resultant array, res[].</p>
<b>Note:</b><p>Each element is res[] lies inside the 32-bit integer range.</p>


<b>Examples:</b>

<pre>
<b>Input:</b> arr[] = [10, 3, 5, 6, 2]
<b>Output:</b> [180, 600, 360, 300, 900]
<b>Explanation:</b> For i=0, res[i] = 3 * 5 * 6 * 2 is 180.
For i = 1, res[i] = 10 * 5 * 6 * 2 is 600.
For i = 2, res[i] = 10 * 3 * 6 * 2 is 360.
For i = 3, res[i] = 10 * 3 * 5 * 2 is 300.
For i = 4, res[i] = 10 * 3 * 5 * 6 is 900.
</pre>

<pre>
<b>Input:</b> arr[] = [12, 0]
<b>Output:</b> [0, 12]
<b>Explanation:</b> For i = 0, res[i] is 0.
For i = 1, res[i] is 12.
</pre>






