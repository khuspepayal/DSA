class Solution {
    public void duplicateZeros(int[] arr) {
        int zeros=0;
        int last_index=arr.length-1;
        
        for(int i=0;i<=last_index-zeros;i++){
            if(arr[i]==0){
                if(i==last_index-zeros){
                    arr[last_index]=0;
                    last_index -= 1;
                    break;
                }
                zeros++;
            }
        }
        int newLastIndex=last_index-zeros;
        for (int i = newLastIndex; i >= 0; i--) {

            if (arr[i] == 0) {
                arr[i + zeros] = 0;
                zeros--;
                arr[i + zeros] = 0;
            } else {
                arr[i + zeros] = arr[i];
            }
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna