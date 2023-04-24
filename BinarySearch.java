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
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int target = 10;

        int foundIndex = getIndex(arr, target);
        if(foundIndex == -1) {
            System.out.println("no element found");
        }else {
            System.out.println("Element found at: "+foundIndex);
        }

    }
}