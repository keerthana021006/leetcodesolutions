// Last updated: 2/4/2026, 8:29:04 PM
class Solution {
    public int hammingWeight(int n) {
         int result = 0;
        for (int i = 0; i < 32; i++) {
            if (((n >> i) & 1) == 1) {
                result += 1;
            }
        }
        return result;     
    }
}