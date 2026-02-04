// Last updated: 2/4/2026, 8:27:16 PM
class Solution {
    public boolean canAliceWin(int[] nums) {
        int singleDigit = 0;
        int doubleDigit = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]<10) singleDigit+=nums[i];
            else doubleDigit+=nums[i];
        }
        return singleDigit!= doubleDigit;
    }
}