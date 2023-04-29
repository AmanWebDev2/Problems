package BitManipulation;

/*
 * set ith bit : 1 -> 1
 * 0 -> 1
 */
public class SetIthBit {
    public static void main(String[] args) {
        int num = 10;
        int i = 3;

        int ans = num^(1<<(i-1));
        System.out.println(ans);

    }
}
