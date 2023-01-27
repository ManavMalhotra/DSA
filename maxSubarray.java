class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];
        
        for(int i = 1; i< nums.length; i++){
            if(currentSum + nums[i]>nums[i]){
                currentSum = currentSum + nums[i];
            }else{
                currentSum = nums[i]; //update if currentSum + num < nums[i]
            }
            if(currentSum>maxSum){
                maxSum = currentSum;
            }
        }
        
        return maxSum;
    }
}