<h2><a href="https://www.geeksforgeeks.org/problems/reverse-a-linked-list-in-groups-of-given-size/1">Linked List Group Reverse

</a></h2> <img src='https://img.shields.io/badge/Difficulty-Hard-red' alt='Difficulty: Hard' /><hr>

<p>Given the head a linked list, the task is to reverse every k node in the linked list. If the number of nodes is not a multiple of k then the left-out nodes in the end, should be considered as a group and must be reversed.</p>


<b>Examples:</b>

<pre>
<b>Input:</b> head = 1 -> 2 -> 2 -> 4 -> 5 -> 6 -> 7 -> 8, k = 4
<b>Output:</b> 4 -> 2 -> 2 -> 1 -> 8 -> 7 -> 6 -> 5
<b>Explanation:</b> The first 4 elements 1, 2, 2, 4 are reversed first and then the next 4 elements 5, 6, 7, 8. Hence, the resultant linked list is 4 -> 2 -> 2 -> 1 -> 8 -> 7 -> 6 -> 5.
</pre>

<pre>
<b>Input:</b>head = 1 -> 2 -> 3 -> 4 -> 5, k = 3
<b>Output:</b> 3 -> 2 -> 1 -> 5 -> 4
<b>Explanation:</b> The first 3 elements 1, 2, 3 are reversed first and then left out elements 4, 5 are reversed. Hence, the resultant linked list is 3 -> 2 -> 1 -> 5 -> 4.
</pre>








