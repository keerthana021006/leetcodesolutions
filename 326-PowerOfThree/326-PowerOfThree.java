// Last updated: 2/4/2026, 8:28:49 PM
class Solution {
    public boolean isPowerOfThree(int n) {
        if (n == 1) 
        return true;
        if (n <= 0 || n % 3 != 0) 
        return false;
        return isPowerOfThree(n / 3);
    }
}