public class BinarySearch {
    public int ascendingSearch(int[] nums, int num) {
        int low = 0;
        int high = nums.length - 1;
        int mid;

        while (true){
            if ((low>high) || (high<low)) {
                return -1;
            }

            mid = (int) (low+high)/2;

            if (nums[mid]==num) {
                return num;
            }
            else if (num > nums[mid]) {
                low = mid+1;
            }
            else if (num < nums[mid]) {
                high = mid-1;
            }
        }
    }

    public int descendingSearch(int[] nums, int num) {
        int high = nums.length - 1;
        int low = 0;
        int mid;

        while (true){
            if ((low>high) || (high<low)) {
                return -1;
            }

            mid = (int) (low+high)/2;

            if (nums[mid]==num) {
                return num;
            }
            else if (num > nums[mid]) {
                high = mid-1;
            }
            else if (num < nums[mid]) {
                low = mid+1;
            }
        }
    }
}
