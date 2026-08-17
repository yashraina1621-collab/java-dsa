package Sorting;

public class LC_26_RemoveDuplicatesfromSortedArray {

    public static void main(String[] args) {

        int[] nums = {1, 1, 2, 2, 3};

        int i = 0;

        for (int j = 1; j < nums.length; j++) {

            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }

        int k = i + 1;

        System.out.println("Unique elements = " + k);

        System.out.print("Array after removing duplicates: ");

        for (int x = 0; x < k; x++) {
            System.out.print(nums[x] + " ");
        }
    }
}
