import java.util.Arrays;
//  Time Complexity: O(n^2)
// Space Complexity: O(1)
public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        selectionSort(arr);        
        System.out.println(Arrays.toString(arr));

    }

    static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int min_index = i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[j] < arr[min_index]) {
                    // update min_index
                    min_index = j;
                }
            }
            if(min_index != i) {
                // swap
                int temp = arr[min_index];
                arr[min_index] = arr[i];
                arr[i] = temp;
            }
        }
    }
}
