import java.util.Scanner;

/**
 * PowerOfElement
 */
public class PowerOfElement {

    /*
        bruteForce:
        Time Complexity direct dependent on b : O(b);
        Space Complexity: O(n);
    */
    static long pow(long a, long b) {
        // base case
        if(b==1) return a;
        return a * pow(a, b-1);
    }

    static long optimizedPow(long a, long b) {
        long mid = 0,result = 0, finalResult = 0;
        if(b==1) return a;
        mid = b/2;
        result = optimizedPow(a, mid);
        finalResult = result * result;
        if(b%2==0) return finalResult;
        return a * finalResult;
    }
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        long a,b;

        System.out.print("Enter a number and it's power: ");
        a = scan.nextLong();
        b = scan.nextLong();

        System.out.println(pow(a, b));
        System.out.println(optimizedPow(a, b));
    }
}