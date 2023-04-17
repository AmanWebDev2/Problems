public class SecondLargestValue {

    public int approach1(int arr[], int n) {
        int maxValue = 0;
        int secMaxValue = -1;
        if(n == 1) return arr[0];

        // finding max value
        for(int val: arr) {
            if(val > maxValue) {
                maxValue = val;
            }
        }

        // finding sec max value
        for(int val: arr) {
            if(val > secMaxValue && val != maxValue) {
                secMaxValue = val;
            }
        }
        return secMaxValue;
    }

    public int approach1_pointerWay(int arr[], int n) {
        if(n == 1) return arr[0];

        int maxVal = 0;
        int secMaxVal = -1;
        int ptr = 0;

        while(ptr < n) {
            if(arr[ptr] > maxVal) {
                maxVal = arr[ptr];
            }
            ptr++;
        }
        System.out.println(maxVal);
        // set pointer to initial pos
        ptr = 0;
        while(ptr < n) {
            if(arr[ptr] > secMaxVal && arr[ptr] != maxVal) {
                secMaxVal = arr[ptr];
            }
            ptr++;
        }

        return secMaxVal;

    }
    public static void main(String[] args) {
        SecondLargestValue slv = new SecondLargestValue();
        
        int arr[] = {1,2,3,4,5};

        int val1 = slv.approach1(arr, arr.length);
        int val2 = slv.approach1_pointerWay(arr, arr.length);
        System.out.println(val1);
        System.out.println(val2);
    }
}