public class Palindrome {

    void approach1(int arr[], int n) {
        /**
         * Time Complexity: O(n);
         * Space Complexity: O(n);
        */

        int newArr[] = new int[n];
        // copy
        for(int i=n-1; i>=0; i--) {
            newArr[n-i-1] = arr[i];
        }

        // compare
        for(int i=0; i<n; i++) {
            if(arr[i] != newArr[i]) {
                System.out.println("not a palindrome");
                return;
            }
        }
        System.out.println("palindrome");
    }

    void approach2(int arr[], int n) {
        /*
         * Time Complexity: O(n);
         * Space Complexity: O(1);
         */

         for(int i=0; i<n/2; i++) {
            if(arr[i] != arr[n-i-1]) {
                System.out.println("not a palindrome");
                return;
            }
         }
         System.out.println("palindrome");
    }

    public static void main(String ...args) {
         
        Palindrome p = new Palindrome();
        int arr[] = {1,2,3,2,1,1};
        p.approach1(arr,arr.length);
        p.approach2(arr,arr.length);
    }
}