
class Solution {
    int countIncreasing(int arr[], int n) {
        int count = 0;
        int currCount = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                currCount++;
                count += currCount;
            } else {
                currCount = 0;
            }
        }

        return count;
    }
}
