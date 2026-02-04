// Last updated: 2/4/2026, 8:27:49 PM
class Solution {
    public int commonFactors(int a, int b) {
        int count = 0;
        int n = Math.max(a,b);
        for(int i=1; i<=n; i++){
            if(a%i == 0 && b%i == 0) count++;
        }
    return count;
    }

}