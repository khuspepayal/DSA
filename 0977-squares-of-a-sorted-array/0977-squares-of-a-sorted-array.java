class Solution {
    public int[] sortedSquares(int[] nums) {
        int [] ans=new int [nums.length];
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            ans[i]=n*n;
        }
        Arrays.sort(ans);
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna