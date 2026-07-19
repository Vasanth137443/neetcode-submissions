class Solution {
    public void sortColors(int[] nums) {

        // Count variables
        int zero = 0;
        int one = 0;
        int two = 0;

        // Count 0s, 1s and 2s
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 0) {
                zero++;
            } else if (nums[i] == 1) {
                one++;
            } else {
                two++;
            }
        }

        // Start filling from index 0
        int index = 0;

        // Fill all 0s
        while (zero > 0) {
            nums[index] = 0;
            index++;
            zero--;
        }

        // Fill all 1s
        while (one > 0) {
            nums[index] = 1;
            index++;
            one--;
        }

        // Fill all 2s
        while (two > 0) {
            nums[index] = 2;
            index++;
            two--;
        }
    }
}