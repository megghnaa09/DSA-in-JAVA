class Solution {

    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    void mergeSort(int[] arr, int low, int high) {

        if (low >= high) {
            return;
        }

        int mid = low + (high - low) / 2;

        // Sort left half
        mergeSort(arr, low, mid);

        // Sort right half
        mergeSort(arr, mid + 1, high);

        // Merge both halves
        merge(arr, low, mid, high);
    }

    void merge(int[] arr, int low, int mid, int high) {

        int[] temp = new int[high - low + 1];

        int i = low;
        int j = mid + 1;
        int k = 0;

        // Compare elements from both halves
        while (i <= mid && j <= high) {

            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }

            k++;
        }

        // Remaining elements of left half
        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }

        // Remaining elements of right half
        while (j <= high) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        // Copy back to original array
        for (int x = 0; x < temp.length; x++) {
            arr[low + x] = temp[x];
        }
    }
}