class Solution {
    public int[] rearrangeArray(int[] nums) {
        int [] ans=new int[nums.length];
        int j=0;
        int [] pos=new int [(nums.length)/2];
        int k=0;
        int [] neg=new int [nums.length/2];

        for(int i=0;i<nums.length;i++){
            if(nums[i] >0){
                pos[j]=nums[i];
                j++;
            }
            else{
                neg[k]=nums[i];
                k++;
            }
        }
        int l=0;
        int m=0;
        for(int i=0;i<ans.length;i++){
             if (i%2 == 0) {
               ans[i]=pos[l++];
             }
             else {
               ans[i]=neg[m++];
             }
        }
        return ans;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna