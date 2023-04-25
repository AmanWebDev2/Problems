package BinarySearch;

public class Problem2_Floor_of_a_number {

    static int getFloorElement(int arr[],int target) {
        int start = 0;
        int end = arr.length-1;
        if(target < arr[start]) return -1;
        while(start <= end) {
            int mid = start + (end-start)/2;
            if(target == arr[mid]) {
                return mid;
            }
            if(target > arr[mid]) {
                start = mid+1;
            }else {
                end = mid-1;
            }
        }
        return end;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,5,9,14,16,18};
        // Floor of a number
        // greates number <= target
        System.out.println(getFloorElement(arr, 19));
    }
}
