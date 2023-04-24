/**
 * LinearSearch
 */
public class LinearSearch {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};

        int target = 10;
        int idx = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                idx = i;
                break;
            }
        }

        if(idx == -1) {
            System.out.println("no element found");
        }else {
            System.out.println("Element at index: "+idx);
        }
    }
}