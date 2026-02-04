// Last updated: 2/4/2026, 8:29:07 PM
class Solution {
    public int trailingZeroes(int n) {
         int res = 0;
    while (n > 0) {
        n /= 5;
        res += n;
    }
    return res;
    }
}