// Last updated: 2/4/2026, 8:27:26 PM
class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int i = 1;
        int fuel = mainTank;
        while(fuel - 4*i > 0 && additionalTank--> 0) i++;
        i--;
        return (i*5+fuel-i*4)*10;
    }
}