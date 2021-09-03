public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] arr = {1,3, 5, 6};
        int t = 9;
        int res = searchInsertPosition(arr, t);
        System.out.println("=> "+ res);
    }

    public static int searchInsertPosition(int[] nums, int target){

        int left= 0;
        int right = nums.length - 1;
        while (left <= right){
            int mid = (left + right)/2;
            if (target == nums[mid]){
                return nums[mid];
            }
            if (target > nums[mid]){
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        return left;
    }
}
