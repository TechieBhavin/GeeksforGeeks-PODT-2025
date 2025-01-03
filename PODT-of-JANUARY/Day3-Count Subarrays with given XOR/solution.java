class Solution {
    public long subarrayXor(int arr[], int k) {
        // code here
         HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int XOR = 0;
        int ans = 0;
        for(int i : arr){
            XOR ^= i;
            if(map.containsKey(XOR^k)){
                ans += map.get(XOR^k);
            }
            map.put(XOR, map.getOrDefault(XOR, 0)+1);
        }
        return ans;
    }
}
