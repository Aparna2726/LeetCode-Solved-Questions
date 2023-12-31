class Solution {
    public int countOnes(int n) {
        int count = 0;
        while(n != 0) {
            count += (n&1);
            n = n>>1;
        }
        return count;
    }
    public int[] countBits(int n) {
        int ans[] = new int[n+1];
        ans[0] = 0;
        for(int i=1; i<ans.length; i++) {
            ans[i] = countOnes(i);
        }
        return ans;
    }
}