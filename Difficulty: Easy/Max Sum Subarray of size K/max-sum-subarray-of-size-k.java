class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int maxsum = 0;
        int cursum = 0;
        int left = 0, right = 0;
        while (right < arr.length){
            if (right-left == k){
                cursum -= arr[left];
                left++;
            }
            cursum += arr[right];
            maxsum = cursum > maxsum ? cursum : maxsum;
            right++;
        }
        return maxsum;
            
    }
}