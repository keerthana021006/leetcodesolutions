// Last updated: 2/4/2026, 8:27:24 PM
class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int iCount = 0;
        for(int i=0; i<hours.length; i++){
            if(hours[i]>=target){
                iCount++;
            }
        }
    return iCount;
    }
}