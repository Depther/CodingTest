import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {2,5,1,3,4,7};
        System.out.println(Arrays.toString(solution.shuffle(nums, 3)));
    }

    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[n * 2];
        int count = 0;
        for (int i = 0; i < n; i++) {
            result[count++] = nums[i];
            result[count++] = nums[i + n];
        }
        return result;
    }
}