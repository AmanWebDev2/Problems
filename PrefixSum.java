import java.util.Arrays;
import java.util.Scanner;

public class PrefixSum {

    static void prefixSumApproach1(int arr[][], int r1, int r2, int c1, int c2) {
        /*
         * Time Complexity: O(m*n);
         * Space Complexity: O(1);
         */
        int sum = 0;
        for(int i=r1; i<=r2; i++) {
            for(int j=c1; j<=c2; j++) {
                sum+=arr[i][j];
            }
        }
        System.out.println("Prefix sum: "+sum);
    }

    static void prefixSumApproach2(int arr[][], int r1, int r2, int c1, int c2) {
        // row-wise prefix sum
        int m = arr.length;
        int n = arr[0].length;
        for(int i=0; i<m; i++) {
            for(int j=1; j<n; j++) {
                arr[i][j] += arr[i][j-1];
            }
        }

        // column-wise prefix sum
        for (int i = 0; i < m; i++) {
            for (int j = 1; j < n; j++) {
                arr[j][i] += arr[j-1][i];
            }
        }

        // sum region
        int sum=0, left=0, top=0, repeatedRegion=0, result=0;
        
        sum = arr[r2][c2];
        top = arr[r1-1][c2];
        left = arr[r2][c1-1];
        repeatedRegion = arr[r1-1][c1-1];

        result = sum - left - top + repeatedRegion;
        System.out.println("Result: "+result);

        // for(var elem: arr) {
        // System.out.println(Arrays.toString(elem));
        // }
    }

    public static void main(String[] args) {
        try (
            Scanner scan = new Scanner(System.in);
        ) {
            System.out.println("Enter number of rows");
            int m = scan.nextInt();
            System.out.println("Enter number of columns");
            int n = scan.nextInt();

            int arr[][] = new int[m][n]; 

            // enter array input
            for(int i=0; i<m; i++) {
                for(int j=0; j<n; j++) {
                    arr[i][j] = scan.nextInt();
                }
            }
            // for(var num: arr) {
            //     System.out.println(Arrays.toString(num));
            // }

            int r1,c1,r2,c2;
            System.out.print("Enter the value of r1 coordinate: ");
            r1 = scan.nextInt();
            System.out.print("Enter the value of c1 coordinate: ");
            c1 = scan.nextInt();

            System.out.print("Enter the value of r2 coordinate: ");
            r2 = scan.nextInt();
            System.out.print("Enter the value of c2 coordinate: ");
            c2 = scan.nextInt();

            // prefixSumApproach1(arr, r1, r2, c1, c2);
            prefixSumApproach2(arr, r1, r2, c1, c2);
            
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
}
