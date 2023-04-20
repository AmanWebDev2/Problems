public class Duplicate {
    public static void main(String[] args) {
        int arr[] = {1,2,3,32,4,52,5};
        int n = arr.length;
        int flag = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i] == arr[j]) {
                    flag = 1;
                    System.out.println("Duplicate found: "+arr[i]);
                }
            }
        }

        if(flag == 0) {
            System.out.println("No duplicate elements");
        }
    }
}
