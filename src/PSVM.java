public class PSVM {
    public static void main(String[] args) {
        PrintArray printArray = new PrintArray();
        int[] array = {1, 2, 9, 3, 7, 5,4,8};
        int[] fullsearch, insertionsort, selectionSort, mergesort, quickSort;
        SortOut sortOut = new SortOut(new SortSelectionSort());
        // selectionSort = sortOut.sort(array);
        //System.out.println("Selection Sort:");
        //printArray.print(selectionSort);
        //sortOut = new SortOut(new SortFullSearch());
        //System.out.println("Sort Full Search");
        //fullsearch= sortOut.sort(array);
        //printArray.print(fullsearch);
        //sortOut = new SortOut(new SortInsertionSort());
        //insertionsort = sortOut.sort(array);
        //System.out.println("Insertion sort:");
        //printArray.print(insertionsort);
        sortOut= new SortOut(new SortMergeSort());
        mergesort=sortOut.sort(array);
        System.out.println("Merge Sort");
        printArray.print(mergesort);
        //sortOut = new SortOut(new SortQuickSort());
        //quickSort = sortOut.sort(array);
        //System.out.println("Quick Sort");
        //printArray.print(quickSort);

    }
}
