public class RemoveDuplicatesSortedArray {
    public static void main(String[] args) {

        int arr[] = {0, 1, 1, 1, 2, 2, 3, 4,5,5};
        int result = removeDuplicates(arr);
        System.out.println(result);
    }

    public static int removeDuplicates(int nums[] ){
        int k = 1;
        for (int i = 0; i < nums.length - 1; i++){
            if (nums[i] != nums[i + 1]){
                nums[k++] = nums[i + 1];
                System.out.println(nums[i]);
            }
        }
        return k;
    }
}
