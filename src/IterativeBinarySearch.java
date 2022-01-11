public class IterativeBinarySearch {
    public static int binarySearch(int[] nums, int check){
        int hi = nums.length -1;
        int lo = 0;

        while (hi >= lo){
            int guess = (lo + hi) >>> 1; // From Open JDK
            if (nums [guess] > check){
                hi = guess - 1;
            } else if (nums[guess] < check){
                lo = guess + 1;
            } else {
                return guess;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] haystack = {1,5,6,7,8,11,15,17};
        int needle = 11;
        int index = binarySearch(haystack, needle);
        if (index == -1){
            System.out.println(needle + "is Not in the Array");
        } else {
            System.out.println(needle + "is at index" + index);
        }
    }
}
