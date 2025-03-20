
public class Main {
    public static void main(String[] args) {
        int[] nums = {1,9,2,4,8};
        int[] sortedNums = {1,3,5,7,9};
        int[] sortedNums2 = {9,7,5,3,1};
        int res;

        LinearSearch ls = new LinearSearch();
        System.out.println("Linear Search : ");
        System.out.println(ls.search(nums,2));

        BinarySearch bs = new BinarySearch();
        System.out.println("Binary Search (Descending) : ");
        System.out.println(bs.ascendingSearch(sortedNums,9));

        res = bs.descendingSearch(sortedNums2,5);
        System.out.println("Binary Search (Descending) : ");
        System.out.println(res);

    }
}
