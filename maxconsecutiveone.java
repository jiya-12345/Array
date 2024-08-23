public class MaxConsecutiveOnesKadane {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0; // To keep track of the maximum length of consecutive 1's
        int currentCount = 0; // To keep track of the current length of consecutive 1's
        
        for (int num : nums) {
            if (num == 1) {
                currentCount++; // Increase the count of consecutive 1's
            } else {
                maxCount = Math.max(maxCount, currentCount); // Update maxCount if needed
                currentCount = 0; // Reset currentCount since we encountered a 0
            }
        }
        
        // Final check to update maxCount in case the array ends with consecutive 1's
        return Math.max(maxCount, currentCount);
    }
