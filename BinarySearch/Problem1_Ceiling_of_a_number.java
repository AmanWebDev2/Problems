package BinarySearch;

public class Problem1_Ceiling_of_a_number {

    static int getCeilingElement(int []arr,int target) {
        int start = 0;
        int end = arr.length-1;
        if(target >  arr[end]) return -1;
        while(start <= end) {
            int mid = start +(end-start)/2;
            if(target == arr[mid]) {
                return mid;
            }
            // asc
            if(target > arr[mid]) {
                start = mid+1;
            }else {
                end = mid-1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int arr[] = {2,3,5,9,14,16,18};
        // problem 1. Ceiling of a Number
        // smallest number which is >= target
        System.out.println(getCeilingElement(arr, 14));
    }
}
