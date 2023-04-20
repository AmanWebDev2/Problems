public class Reversal {
    public static void main(String[] args) {
        
        int arr[] = {1,2,4,5,6};
        int n = arr.length;

        for(int i=0; i<n/2; i++) {
            // swap;
            int temp = arr[n-i-1];
            arr[n-i-1] = arr[i];
            arr[i] = temp;
        }
        
        // reversal
        System.out.print("reversal: ");
        for(int i=0; i<n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
