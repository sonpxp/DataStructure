package leetcode;

public class _68_SqrtX {

    public static void main(String[] args) {
        System.out.println(mySqrt(8));
        System.out.println("ef");
    }

    public static int mySqrt(int x) {

        int start = 0;
        int end = x;
        long mid;

        while(start <= end){
            mid = start + (end - start) / 2;
            if((mid * mid) == x){
                return (int)mid;
            }
            else if((mid * mid) > x){
                end = (int)mid - 1;
            }
            else start = (int)mid + 1;
        }
        return end;
    }
}
