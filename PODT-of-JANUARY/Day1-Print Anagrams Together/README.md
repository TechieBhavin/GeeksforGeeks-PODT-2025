
<h2><a href="https://www.geeksforgeeks.org/problems/print-anagrams-together/1">Print Anagrams Together
</a></h2> <img src='https://img.shields.io/badge/Difficulty-Easy-brightgreen' alt='Difficulty: Easy' /><hr>

<p>Given an array of strings, return all groups of strings that are anagrams. The strings in each group must be arranged in the order of their appearance in the original array. Refer to the sample case for clarification.</p>


<b>Examples:</b>

<pre>
<b>Input:</b> arr[] = ["act", "god", "cat", "dog", "tac"]
<b>Output:</b> [["act", "cat", "tac"], ["god", "dog"]]
<b>Explanation:</b> There are 2 groups of anagrams "god", "dog" make group 1. "act", "cat", "tac" make group 2.
</pre>

<pre>
<b>Input:</b> arr[] = ["no", "on", "is"]
<b>Output:</b> [["is"], ["no", "on"]]
<b>Explanation:</b> There are 2 groups of anagrams "is" makes group 1. "no", "on" make group 2.
</pre>

<pre>
<b>Input:</b> arr[] = ["listen", "silent", "enlist", "abc", "cab", "bac", "rat", "tar", "art"]
<b>Output:</b> [["abc", "cab", "bac"], ["listen", "silent", "enlist"], ["rat", "tar", "art"]]
<b>Explanation:</b> Group 1: "abc", "bac", and "cab" are anagrams.
Group 2: "listen", "silent", and "enlist" are anagrams.
Group 3: "rat", "tar", and "art" are anagrams.
</pre><hr>




