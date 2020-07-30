package JavaAlgorithm;

//use quick sort;




import java.util.Comparator;

public class ArraysSort1 {
    public static void sort(Comparable[] array) {
        int len = array.length;
        helper1(array, 0, len - 1);
    }
    public static void sort(Comparable[] array, Comparator<Comparable> a) {
        int len = array.length;
        helper2(array, a, 0, len - 1);
    }
    public static void helper2(Comparable[] array, Comparator<Comparable> a, int left, int right) {
        if (left >= right) {
            return;
        }
        int len = right - left + 1;
        int random = (int)(len * Math.random()) + left;
        swap(array, random, right);
        int j = right - 1;
        int i = left;
        while (i <= j) {
            if (a.compare(array[i], array[j]) >= 0) {
                swap(array, i, j);
                j --;
            }
            else {
                i ++;
            }
        }
        swap(array, i, right);
        helper2(array, a,i + 1, right);
        helper2(array, a, left, i - 1);
    }
    private static void helper1(Comparable[] array, int left, int right) {
        if (left >= right) {
            return;
        }
        int len = right - left + 1;
        int random = (int)(len * Math.random()) + left;
        swap(array, random, right);
        int j = right - 1;
        int i = left;
        while (i <= j) {
            if (array[i].compareTo(array[right]) >= 0) {
                swap(array, i, j);
                j --;
            }
            else {
                i ++;
            }
        }
        swap(array, i, right);
        helper1(array, i + 1, right);
        helper1(array, left, i - 1);
    }
    private static void swap(Object[] array, int a, int b) {
        Object temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
