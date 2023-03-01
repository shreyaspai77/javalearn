package kunalproblems;

public class FirstLastOccurence {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = { -1, -1 };
        int start = search(nums, target, true);
        int end = search(nums, target, false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }

    // create a function that can use a boolean to check the first and last
    // occurence
    // for true find the first occurence for false find the last
    public int search(int[] nums, int target, boolean FindStartIndex) {
        int ans = -1;

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2; // sometimes might give error , so better use
            // low + (low-high)/2; since if the range of l+h exceeds that of int
            if (nums[mid] == target) {
                ans = mid;// update the value of ans to have the index of the first
                if (FindStartIndex) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
            mid = (low + high) / 2;
        }

        return ans;
    }
}
