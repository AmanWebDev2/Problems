package BitManipulation;

public class FindTheIthBit {
    public static void main(String[] args) {
        int num = 14;
        int i = 5; 
        int ans = num&(1<<(i-1));
        System.out.println(i+"th bit is "+ans);
    }
}
