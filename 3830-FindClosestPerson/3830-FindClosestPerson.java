// Last updated: 2/4/2026, 8:27:10 PM
class Solution {
    public int findClosest(int x, int y, int z) {
       int d = (x-y) * (x + y - 2 * z);
       return (d!= 0?1:0) << (d>0?1:0); 
    }
}