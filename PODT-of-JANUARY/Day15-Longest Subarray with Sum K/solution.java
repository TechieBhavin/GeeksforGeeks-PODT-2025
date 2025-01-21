class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        int n = arr.length;
        int sum = 0;
        int maxLength = 0;
        int len=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        for (int i = 0; i < n; i++) {
            sum+=arr[i];
            if(map.containsKey(sum-k)){
                len=i-map.get(sum-k);
                maxLength=Math.max(len,maxLength);
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        return maxLength;
    }
}
