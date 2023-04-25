/**
 * BinarySearch
 */
public class BinarySearch {

    static int getIndex(int arr[],int target) {
        int low = 0;
        int high = arr.length-1;

        while(low <= high) {
            int mid = low + (high-low)/2;
            if(target == arr[mid]){
                return mid;
            }else if(target > arr[mid]) {
                low = mid+1;
            }else {
                high = low-1;
            }
        }
        return -1;
    }

    // orderAgnostic - to know wether array is sorted in ascending order or not by comparing last and first value
    static int orderAgnosticBS(int arr[], int target) {
        int start = 0;
        int end = arr.length-1;
        boolean isAsc = arr[start] < arr[end];
        while(start <= end) {
            int mid = start + (end-start)/2;

            if(target == arr[mid]) {
                return mid;
            }

            if(isAsc) {
                if(target > arr[mid]) {
                    start = mid+1;
                }else {
                    end = mid -1;
                }
            }else {
                if(target > arr[mid]) {
                    end = mid-1;
                }else {
                    start = mid+1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int target = 102;

        int foundIndex = getIndex(arr, target);
        System.out.println(foundIndex);
        
        System.out.println(orderAgnosticBS(arr, target));

    }
}