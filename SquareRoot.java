import javax.print.attribute.standard.RequestingUserName;

public class SquareRoot {
    static int getSquareRoot(int num) {
        int start = 1;
        int end = num;
        while(start<=end) {
            int mid = start+(end-start)/2;
            int val = num/mid;
            if(mid < val) {
                start = mid+1;
            }else if(mid > val){
                end = mid-1;
            }else{
                return mid;
            }
        }
        return end;
    }
    public static void main(String[] args) {
        System.out.println(getSquareRoot(10));
    }
}
