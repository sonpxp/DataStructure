package sort;

public class bubbleSrot {

    public static void bubbleSrot(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            Boolean isSorted = true;
            for (int j = 0; j < n - i - 1; j++) {
                //j, j+1 < n - i --> j < n - i - 1
                if (a[j] > a[j + 1]) {
                    //nếu a[j] > a[j] thì đổi chỗ
                    isSorted = false;
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
            printArray(i, a);
            if (isSorted) {
                break;
            }
        }
    }
    public static void printArray(int no, int[] a) {
        System.out.printf("%d: ", no);
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d, ", a[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a = {5, 3, 2, 7, 8, 1, 2};
        //int[] b = {1, 2, 3, 6, 5, 7, 8, 9};
        //bubbleSrot(a);
        //insertionSrot(a);
        //selectionSrot(a);
        bubbleSrot(a);
    }


}
