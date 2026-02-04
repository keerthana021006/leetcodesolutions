// Last updated: 2/4/2026, 8:29:12 PM
class Solution {
    public int singleNumber(int[] nums) {
         int res = 0;

        for (int n : nums) {
            res ^= n;
        }

        return res;       
        
    }
}