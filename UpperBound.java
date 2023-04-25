/**
 * UpperBound
 * Time Complexity: O(logN)
 * Space Complexity: O(1);
 */
public class UpperBound {
    
    static int getLastOccurrence(int arr[], int target) {
        int start = 0;
        int end = arr.length-1;
        int index = -1;
        while(start<=end) {
            int mid = start+(end-start)/2;

            if(target < arr[mid]) {
                end = mid-1;
            }else if(target > arr[mid]) {
                start = mid+1;
            }else {
                index = mid;
                // search on the right side
                start = mid+1;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,7,7,7,9,9,9};
        System.out.println(getLastOccurrence(arr, 7));
    }
}