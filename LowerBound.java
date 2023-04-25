public class LowerBound {
    static int getFirstOccurrence(int[] arr, int target) {
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
                //mid, might be possible ans;
                index = mid;
                // search on the left side 
                end = mid-1;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,7,7,9,9,9};
        System.out.println(getFirstOccurrence(arr, 7));

    }
}
