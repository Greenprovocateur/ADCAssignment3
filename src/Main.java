public class Main {
    public static void main(String[] args) {
        Sorter sorter = new Sorter();
        Searcher searcher = new Searcher();
        Experiment experiment = new Experiment(sorter, searcher);

        System.out.println("Insertion Sort | Merge Sort | Linear Search");


        experiment.run();
    }
}