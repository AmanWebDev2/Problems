package BitManipulation;

public class EvenOdd {
    public static void main(String[] args) {
        int n = 14;
        int lastBit = n&1;
        if(lastBit == 1) {
            // odd
            System.out.println("Odd number");
        }else {
            // even
            System.out.println("Even number");

        }
    }
}
