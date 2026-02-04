// Last updated: 2/4/2026, 8:27:31 PM
class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int a = (arrivalTime + delayedTime)%24; 
        return a;
    }
}