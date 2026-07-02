class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length+1;
        int SumOfN=n*(n-1)/2;
        int SumOfArr=0;
        for(int i=0;i<nums.length;i++){
            SumOfArr+=nums[i];
        }
        return SumOfN-SumOfArr;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna