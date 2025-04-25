class Solution {
    public int getSingle(int[] arr) {
        // code here
              int ones=0,twos=0;
        for(int i:arr) {
            ones=(ones^i)& (~twos);
            twos=(twos^i)& (~ones);
        }
        return ones;
    }
}
