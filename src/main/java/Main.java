import java.util.Arrays;

class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};

        System.out.println(Arrays.toString(solution.nextGreaterElement(nums1, nums2)));
    }

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] position = new int[nums1.length];
        int[] result = new int[nums1.length];
        Arrays.fill(result, -1);

        for (int i = 0, len = nums1.length; i < len; i++) {
            for (int j = 0, len2 = nums2.length; j < len2; j++) {
                if (nums1[i] == nums2[j]) {
                    position[i] = j;
                    break;
                }
            }
        }

        for (int i = 0, len = nums1.length; i < len; i++) {
            for (int j = position[i], len2 = nums2.length; j < len2; j++) {
                if (nums1[i] < nums2[j]) {
                    result[i] = nums2[j];
                    break;
                }
            }
        }

        return result;
    }
}