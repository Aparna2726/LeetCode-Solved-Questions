class Solution {
    public void sortColors(int[] nums) {
        int red = 0; // Pointer for the red (0) section
        int white = 0; // Pointer for the white (1) section
        int blue = nums.length - 1; // Pointer for the blue (2) section

        while (white <= blue) {
            if (nums[white] == 0) {
                // If a 0 is encountered, swap it with the red section
                swap(nums, red, white);
                red++;
                white++;
            } else if (nums[white] == 1) {
                // If a 1 is encountered, just move the pointer
                white++;
            } else {
                // If a 2 is encountered, swap it with the blue section
                swap(nums, white, blue);
                blue--;
            }
        }
    }

    // Helper function to swap elements in the array
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
