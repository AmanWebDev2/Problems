import java.util.Arrays;
/*
 * Time Complexity: O(m*n);
 * Space Complexity: O(1);
 */
public class RotateMatrix {

    static void rotate(int arr[][]) {
        // step1: transpose
        int m = arr.length;
        int n = arr[0].length;

        for(int i=0; i<m; i++) {
            for(int j=i; j<n; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        // step2: swap 
        for(int i=0; i<m; i++) {
            int leftColumnIndex = 0;
            int rightColumnIndex = n-1;
            
            while(leftColumnIndex < rightColumnIndex) {
                int temp = arr[i][leftColumnIndex];
                arr[i][leftColumnIndex] = arr[i][rightColumnIndex];
                arr[i][rightColumnIndex] = temp;

                leftColumnIndex++;
                rightColumnIndex--;
            }

        }
    }

    public static void main(String[] args) {
        int arr[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16},
        };

        rotate(arr);

        for(var elem: arr) {
            System.out.println(Arrays.toString(elem));
        }
    }
}
