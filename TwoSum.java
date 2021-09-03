import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int arr[] = {2, 7, 11 ,15};
        int t = 17;

        int[] results = twoSum(arr, t);
        System.out.println(results[0] + " " + results[1]);
    }
    // arr = [2, 3, 4 ,7, 8]
    // t = 9;
    // map<>
    // O(n): Time, O(n) Spce
    public static int[] twoSum(int[] arr, int target){
        Map<Integer, Integer> visited = new HashMap<>();
        for (int i = 0; i < arr.length; i++){
            int delta = target - arr[i];
            if (visited.containsKey(delta)){
                return new int[] {visited.get(delta), i};
            }
            visited.put(arr[i], i);
        }
        return new int[]{-1, -1};
    }
}
