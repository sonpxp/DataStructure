package leetcode;

public class _1295_FindNumbers {
    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int a : nums) {
            // kiem tra so chu cai cua i
            // neu so do chan --> count +1
            int soLuongChuSo = tinhSoLuong(a);
            if (soLuongChuSo % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    public static int tinhSoLuong(int a) {
        int biendem = 0;
        int kq = a;
        while (kq != 0) {
            kq = a / 10;
            a = kq;
            biendem++;
        }
        return biendem;
    }

    public static void main(String[] args) {
        int[] nums = {1, 25, 3, 345, 4, 2347, 9999};
        /*System.out.println(tinhSoLuong(2));
        System.out.println(tinhSoLuong(23));
        System.out.println(tinhSoLuong(278));
        System.out.println(tinhSoLuong(1234567895));*/

        System.out.println(findNumbers(nums));
    }
}
