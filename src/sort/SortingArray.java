package sort;

public class SortingArray {

    public static void main(String[] args) {
        int[] a = {5, 3, 2, 7, 8, 1, 2};
        //int[] b = {1, 2, 3, 6, 5, 7, 8, 9};
        //bubbleSrot(a);
        //insertionSrot(a);
        selectionSrot(a);
    }

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

    public static void insertionSrot(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) { // i = 0 coi như dãy đã được sắp xếp
            // chen  a[i] vao day 0 -> i-1
            int ai = a[i];
            int j = i-1;
            while (j >= 0 && a[j] > ai){
                a[j+1] =  a[j];
                j--;
            }

            a[j+1] = ai;

            printArray(i, a);
        }
    }

    public static void selectionSrot(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            // tìm các phần tử nhỏ nhất bên phải của i
            int minIndex = i;
            for (int j = i + 1; j < n; j++){
                if (a[j] < a[minIndex]){
                    // tìm min [i, n] -> gán mindex = j
                    minIndex = j;
                }
                if (minIndex != i){
                    int t = a[i];
                    a[i] = a[minIndex];
                    a[minIndex] = t;
                }
            }
            printArray(i, a);
        }
    }



    public static void printArray(int no, int[] a) {
        System.out.printf("%d: ", no);
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d, ", a[i]);
        }
        System.out.println();
    }

}
