// Last updated: 2/4/2026, 8:27:08 PM
class Solution {
    public String reversePrefix(String s, int k) {
        String rev="";
        int n=k-1;
        for(int i=n;i>=0;i--){
            rev=rev+s.charAt(i);
        }
    return rev+s.substring(k);
    }
}