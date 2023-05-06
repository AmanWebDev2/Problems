import java.util.Scanner;

public class CountWays {

    static int countWay(int n) {
        if(n<=1) return n;
        return countWay(n-1)+countWay(n-2);
    }   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // step = 1 , 2;
        System.out.println("Enter the number of stairs: ");
        int n = scan.nextInt();

        System.out.println(countWay(n+1));
    }
}
