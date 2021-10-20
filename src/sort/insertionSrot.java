package sort;

public class insertionSrot {
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
        insertionSrot(a);
        //selectionSrot(a);
        //bubbleSrot(a);
    }

}
