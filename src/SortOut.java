public class SortOut {
    private SorterInterface sorterInterface;

    public SortOut(SorterInterface sorterInterface) {
        this.sorterInterface = sorterInterface;
    }

    public int[] sort(int[] array) {
        return sorterInterface.sorter(array);
    }

}
