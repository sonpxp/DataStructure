package leetcode.array;

//them/chen phan tu vao mang
// marge 2 mang da sap xep
public class _88_Merge_Sorted_Array {

    public static void main(String[] args) {
        int [] n1 = {1,2,3,0,0,0};
        int [] n2 = {2,5,6};
        int m = 3;
        int n = 3;

        merge(n1, m, n2, n);

        System.out.println();
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int ai : nums2) {
            chenPhanTuVaoMang(ai, nums1, m);
            m++;
        }
    }

    private static void chenPhanTuVaoMang(int x, int[] nums1, int m) {
        boolean timDuocK = false;
        for (int k = 0; k < m; k++) {
            if (nums1[k] > x) {
                timDuocK = true;

                for (int i = m - 1; i >= k; i--) {
                    nums1[i + 1] = nums1[i];
                }
                nums1[k] = x;
                break;
            }
        }

        if (!timDuocK) {
            nums1[m] = x;
        }
    }
}
