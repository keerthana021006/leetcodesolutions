// Last updated: 2/4/2026, 8:28:53 PM
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length + 1;
        int total = (n * (n-1 )) / 2; 
        
        for (int num : nums) {
            total -= num;
        }
        
        return total;   
    }
}