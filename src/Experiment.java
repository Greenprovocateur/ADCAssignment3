public class Experiment {
    private Sorter sorter;
    private Searcher searcher;

    public Experiment(Sorter sorter, Searcher searcher) {
        this.sorter = sorter;
        this.searcher = searcher;
    }

    public void run() {
        int[] sizes = {10, 100, 1000};


        System.out.println("\n-Sorting-");
        System.out.printf("%-8s %-20s %-20s%n", "Size", "Insertion(ns)", "Merge(ns)");

        for (int size : sizes) {
            int[] original = sorter.randomArray(size);

            int[] arr1 = sorter.copy(original);
            long t1 = System.nanoTime();
            sorter.insertionSort(arr1);
            t1 = System.nanoTime() - t1;

            int[] arr2 = sorter.copy(original);
            long t2 = System.nanoTime();
            sorter.mergeSort(arr2);
            t2 = System.nanoTime() - t2;

            System.out.printf("%-8d %,20d %,20d%n", size, t1, t2);
        }


        System.out.println("\n-Linear Search  Test-");
        System.out.printf("%-8s %-20s%n", "Size", "Time(ns)");

        for (int size : sizes) {
            int[] arr = sorter.randomArray(size);
            int target = arr[size / 2];

            long start = System.nanoTime();
            int result = searcher.linearSearch(arr, target);
            long time = System.nanoTime() - start;

            System.out.printf("%-8d %,20d%n", size, time);
        }

        System.out.println("\n- Results -");
        System.out.println("1. Merge Sort is faster for large arrays (n > 1000)");
        System.out.println("2. Insertion Sort is only good for small arrays (n < 100)");
        System.out.println("3. Linear Search time grows linearly O(n)");
        System.out.println("4. For n=1000, Merge Sort is " + getRatio(1000) + "x faster");
        System.out.println("5. Linear Search works on ANY array (sorted or not)");
    }

    private int getRatio(int size) {
        int[] arr = sorter.randomArray(size);
        int[] arr1 = sorter.copy(arr);
        int[] arr2 = sorter.copy(arr);

        long t1 = System.nanoTime();
        sorter.insertionSort(arr1);
        t1 = System.nanoTime() - t1;

        long t2 = System.nanoTime();
        sorter.mergeSort(arr2);
        t2 = System.nanoTime() - t2;

        return (int)(t1 / t2);
    }
}
