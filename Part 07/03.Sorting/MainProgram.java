 
public class MainProgram {
 
    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        sort(array);
    }
 
    public static int smallest(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
 
    public static int indexOfSmallest(int[] array) {
        int min = smallest(array);
        int i;
        for (i = 0; i < array.length; i++) {
            if (min == array[i]) {
                break;
            }
        }
        return i;
    }
 
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int i, min = table[startIndex], index = startIndex;
        for (i = startIndex; i < table.length; i++) {
            if (table[i] < min) {
                min = table[i];
                index = i;
            }
        }
        return index;
    }
 
    public static void swap(int[] array, int index1, int index2) {
        int temp;
        temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
 
    public static void sort(int[] array) {
        int i, index1 = indexOfSmallest(array), index2 = indexOfSmallestFrom(array, index1 + 1);
        for (i = index1; i < array.length && index2 < array.length; i++) {
            swap(array, index1, index2);
            index1 = indexOfSmallestFrom(array, index2 + 1);
            index2 = indexOfSmallestFrom(array, index1 + 1);
        }
    }
}
 
