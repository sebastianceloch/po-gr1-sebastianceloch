package pl.edu.uwm.wmii.kotewa.laboratorium00;
import java.util.Comparator;

public class ArrayUtil{
    public static <T extends Comparable<? super T>> boolean isSorted(final T[] array) {
        for (int i = 0; i < array.length - 1; i++)
            if (array[i + 1].compareTo(array[i]) < 0) return false;
        return true;
    }

    public static <T extends Comparable<? super T>> int binSearch(final T[] array, final T key){
        int high = array.length;
        int low = 0;
        int xd = 0;

        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (key.compareTo(array[mid]) > 0) {
                low = mid + 1;
            } else if (key.compareTo(array[mid]) < 0) {
                high = mid - 1;
            } else if (key.compareTo(array[mid]) == 0) {
                xd = (Integer)array[mid];
                break;
            }
        }
        return xd;
    }
}