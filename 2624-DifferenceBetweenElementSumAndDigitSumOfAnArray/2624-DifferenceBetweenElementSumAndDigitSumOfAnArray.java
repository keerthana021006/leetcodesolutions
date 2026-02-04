// Last updated: 2/4/2026, 8:27:37 PM
class Solution {
    public int differenceOfSum(int[] nums) {
        int es = 0;
        int ds = 0;
        for(int x:nums){
            es+=x;
            while(x!=0){
                ds+=x%10;
                x/=10;
            }
        }
    return Math.abs(es - ds);    
    }
}