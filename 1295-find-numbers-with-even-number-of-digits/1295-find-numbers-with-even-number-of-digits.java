class Solution {
    public int findNumbers(int[] nums) {
        int even=0;
        for(int i=0;i<nums.length;i++){
            int count=0;
            int org=nums[i];
            while(org>0){
                int digit=org%10;
                count++;
                org/=10;
            }
            if(count%2==0){
                even++;
            }
    }
            return even;

}
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna