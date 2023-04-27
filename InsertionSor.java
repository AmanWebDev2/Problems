import java.util.Arrays;

/**
 * InsertionSor
 * Time Complexity: O(n^2)
 * Space Complexity: O(1)
 */
public class InsertionSor {

    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while(j>0 && arr[j]<arr[j-1]) {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }
}