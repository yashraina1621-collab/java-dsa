package Arrays;

public class LC_1480_RunningSumof1dArray {
    static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};

        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i - 1] + nums[i];
        }
        for (int num : nums) {
            System.out.println(num + " ");
        }
    }
}
