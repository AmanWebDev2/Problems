package BinarySearch;
// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
public class Problem3_First_and_last_element {
    public static void main(String[] args) {
        int arr[] = {5,7,7,8,8,10};
        int ans[] = searchRange(arr, 8);
        for(var e: ans) {
            System.out.println(e);
        }
    }

    static int[] searchRange(int arr[], int target) {
        int ans[] = {-1,-1};
        int firstOccurence = search(arr, target, true);
        int lastOccurence = search(arr, target, false);
        ans[0] = firstOccurence;
        ans[1] = lastOccurence;
        return ans;
    }

    static int search(int arr[], int target, boolean findStartIndex) {
        int start = 0;
        int end = arr.length-1;
        int ans = -1;
        while(start <= end) {
            int mid = start + (end-start)/2;

            if(target < arr[mid]) {
                end = mid-1;
            }else if(target > arr[mid]){
                start = mid+1;
            }else {
                ans = mid;
                if(findStartIndex) {
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
        }
        return ans;
    }
}
