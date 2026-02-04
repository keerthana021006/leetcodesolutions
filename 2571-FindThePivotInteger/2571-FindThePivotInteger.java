// Last updated: 2/4/2026, 8:27:42 PM
class Solution {
    public int pivotInteger(int n) {
        int total = n*(n+1)/2;
        int sqrt = (int)Math.sqrt(total);
        if(sqrt*sqrt == total) return sqrt;
    return -1;    
    }
}