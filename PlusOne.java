public class PlusOne {
    public static void main(String[] args) {
        int[] arr = {9};
        int[] result = plusOne(arr);
        for (int i:result){
            System.out.print(i);
        }
    }

    public static int[] plusOne(int[] nums) {
        int[] newArray = new int[nums.length + 1];
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] < 9){
                nums[i]++;
                return nums;
            }
            nums[i] = 0;
        }
        newArray[0] = 1;

        return newArray;
    }
}
