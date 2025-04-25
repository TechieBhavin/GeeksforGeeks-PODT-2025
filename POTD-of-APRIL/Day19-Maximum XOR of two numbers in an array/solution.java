class Solution {
    // Define a TrieNode class
    class TrieNode {
        TrieNode[] children = new TrieNode[2]; // Two children for bit 0 and 1
    }

    // Trie root
    TrieNode root = new TrieNode();
    
    // Insert a number into the Trie
    private void insert(int num) {
        TrieNode node = root;
        // Traverse each bit of the number (we assume a 32-bit integer)
        for (int i = 31; i >= 0; i--) {
            int bit = (num >> i) & 1;  // Get the ith bit
            if (node.children[bit] == null) {
                node.children[bit] = new TrieNode();
            }
            node = node.children[bit];
        }
    }
    
    // Find the maximum XOR of the current number with numbers already inserted in the Trie
    private int findMaxXor(int num) {
        TrieNode node = root;
        int maxXor = 0;
        // Traverse each bit of the number (again, we assume a 32-bit integer)
        for (int i = 31; i >= 0; i--) {
            int bit = (num >> i) & 1;
            // Try to pick the opposite bit for maximum XOR
            int oppositeBit = 1 - bit;
            if (node.children[oppositeBit] != null) {
                maxXor |= (1 << i);  // Set the bit to 1 in maxXor
                node = node.children[oppositeBit];
            } else {
                node = node.children[bit];
            }
        }
        return maxXor;
    }

    public int maxXor(int[] arr) {
        int maxResult = 0;
        
        // Insert the first number into the Trie
        insert(arr[0]);
        
        // Try to maximize the XOR for each subsequent number
        for (int i = 1; i < arr.length; i++) {
            // Calculate the XOR of current number with the existing Trie
            maxResult = Math.max(maxResult, findMaxXor(arr[i]));
            // Insert the current number into the Trie
            insert(arr[i]);
        }
        
        return maxResult;
    }
}
