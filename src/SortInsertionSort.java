public class SortInsertionSort implements SorterInterface {
    @Override
    public int[] sorter(int[] array) {

        for (int i = 1; i < array.length; i++) {
            int j = i;
            while (j > 0 && array[j - 1] > array[j]) {
                int temp = array[j - 1];
                array[j - 1] = array[j];
                array[j] = temp;
                j--;
            }
        }
        return array;
    }
}
