class Solution {
    public int[] plusOne(int[] digits) {
        // Start from the last digit
        for (int i = digits.length - 1; i >= 0; i--) {
            // If the digit is less than 9, just increment and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            } else {
                // If the digit is 9, set it to 0 and continue to the next digit
                digits[i] = 0;
            }
        }

        // If all digits were 9, we need a new array
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1; // Set the first digit to 1, rest are already 0
        return newDigits;
    }
}
