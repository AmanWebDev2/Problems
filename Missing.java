/*
 * Time Complexity: O(n);
 * Space Complexity: O(1);
 */

public class Missing {
    static long getMissingValue(int arr[], long n) {
        // sum of n natual no.
        long m = n+1;
        long sum = m*(m+1)/2;

        // sum of elements in an array
        int arrSum = 0;
        for(int num: arr) {
            arrSum+=num;
        }   
        return sum - arrSum;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,7,6,5};
        int n = arr.length;
        long num = Missing.getMissingValue(arr, n);
        System.out.println("missing number: "+num);

    }
}