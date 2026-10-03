public class RotatedBinarySearch {

    public int binarySearch(int[] nums, int start, int end, int target) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public int search(int[] nums, int target) {
        int pivot = findPivot(nums);

        if (pivot == -1) {
            return binarySearch(nums, 0, nums.length - 1, target);
        }

        int result = binarySearch(nums, 0, pivot, target);

        if (result == -1) {
            return binarySearch(nums, pivot + 1, nums.length - 1, target);
        }

        return result;
    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            if (arr[start] >= arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }
}
