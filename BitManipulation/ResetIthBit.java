package BitManipulation;
/*
 * Reset ith bit -->
 * 1 -> 0
 * 0 -> 0
 */
public class ResetIthBit {
    public static void main(String[] args) {
        int  num = 10;
        int i = 2;

        int ans = num&~(1<<(i-1));

        System.out.println(ans);
    }
}
