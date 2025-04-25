class Solution {
    public int findDuplicate(int[] arr) {
        // code here
          // code here
        Arrays.sort(arr);
        int i;
        for( i=0;i<arr.length;i++)
        {
            if(arr[i]==arr[i+1])
            break;
            
        }
        return arr[i];
    }
}
