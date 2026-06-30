class Solution {
    public void moveZeroes(int[] nums) {

    for(int i=0;i<nums.length;i++){
        for(int j=i+1;j<nums.length;j++){
            if(nums[i]==0 && nums[j]!=0){
            nums[i]=nums[j];
            nums[j]=0;
        }
    }
    }
}
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna