public class QuickSortExp extends DoublingExperiment{
    private int size = 10;
    public static void main(String[] args){
        SortingExperiment exp = new SortingExperiment();
        exp.runExperiment(); exp.printBigOh(); }
    protected void doubleN(){ size *= 2; }
    protected double timedTest(){
        int[] n = createInput(size);
        long startTime = System.nanoTime();
        QuickSort.quickSort(n, n.length);
        long endTime = System.nanoTime();
        return (double) endTime - startTime; } }
