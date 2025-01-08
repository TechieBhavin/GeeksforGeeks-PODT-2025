<h2><a href="https://www.geeksforgeeks.org/problems/count-possible-triangles-1587115620/1">Count the number of possible triangles

</a></h2>  <img src='https://img.shields.io/badge/Difficulty-Medium-orange' alt='Difficulty: Medium' /><hr>

<P>Given an integer array arr[]. Find the number of triangles that can be formed with three different array elements as lengths of three sides of the triangle. </P>
<p>A triangle with three given sides is only possible if sum of any two sides is always greater than the third side.</p>


<b>Examples:</b>

<pre>
<b>Input:</b> arr[] = [4, 6, 3, 7]
<b>Output:</b> 3
<b>Explanation:</b> There are three triangles possible [3, 4, 6], [4, 6, 7] and [3, 6, 7]. Note that [3, 4, 7] is not a possible triangle.
</pre>

<pre>
<b>Input:</b> arr[] = [10, 21, 22, 100, 101, 200, 300]
<b>Output:</b> 6
<b>Explanation:</b> There can be 6 possible triangles: [10, 21, 22], [21, 100, 101], [22, 100, 101], [10, 100, 101], [100, 101, 200] and [101, 200, 300]
</pre>

<pre>
<b>Input:</b> arr[] = [1, 2, 3]
<b>Output:</b> 0
<b>Explanation:</b> No triangles are possible.
</pre>










