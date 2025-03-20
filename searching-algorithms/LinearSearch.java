public class LinearSearch {
    public int search(int[] nums, int num) {
        for(int i=0; i<nums.length; i++){
            if(num==nums[i]) {
                return nums[i];
            }
        }
        return -1;
    }
}
