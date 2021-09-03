public class MaximumSubarray {
    public static void main(String[] args) {
        int[] arr = {5,4,-1,7,8};
        int sum = maxSubarraySum(arr);
        System.out.println(sum);
    }

    public static int maxSubarraySum(int[] nums){
        int maxSum = nums[0];
        int currSum = 0;
        for (int i = 0; i < nums.length ; i++ ){
            if (currSum < 0){
                currSum = 0; // if the value is negative rest cursum to 0;
            }
            currSum += nums[i];
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
}
