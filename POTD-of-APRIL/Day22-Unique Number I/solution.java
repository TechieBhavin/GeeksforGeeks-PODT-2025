class Solution {
    public int findUnique(int[] arr) {
        // code here
        Arrays.sort(arr);
        if(arr.length==1)
        return arr[0];
        for(int i=0;i<arr.length-2;i+=2)
        {
            if(arr[i]!=arr[i+1])
            {
                return arr[i];
            }
        }
        return arr[arr.length-1];
    }
}
