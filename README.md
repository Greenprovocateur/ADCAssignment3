    • Which sorting algorithm performed faster? Why?
    • How does performance change with input size?
    • How does sorted vs unsorted data affect performance?
    • Do the results match the expected Big-O complexity?
    • Which searching algorithm is more efficient? Why?
    • Why does Binary Search require a sorted array?
--------------------------------------------------
This code includes two types of sorting such as Insertion Sort(Basic Sorting) and Merge Sort(Advanced Sorting) and one type of searching such as Linear Search.

There are 4 files in total. 
The Sort file stores just two algorithms, Insertion Sort and Merge Sort. Insertion Sort works O(n2), and Merge Sort works O(n log n). Looking at their Big O, state that Merge Sort is faster than Insertion Sort. Especially for large arrays (1000 elements or more). If there are less than 1000 elements, then Insert Sort and Merge Sort will either be the same speed or one of them will be slightly faster than the other.
Sorted and unsorted slightly affect my results, since Linear Search and Merge Sort work with both options. But it is the Insertion Sort that causes great difficulties, since it takes extra time to shift all the elements.

The Experiment file consists of checking all the Sorting and Searching algorithms. According to the results of the launch of the entire program, Experiment proved that all algorithms work according to BigO.

The Searcher file stores the Linear Search algorithm. This is a very simple sorting method, as it checks all the elements of the array one at a time before finding the right one.
While comparing Linear Search and Binary Search, results show that Binary Search is faster, since Linear Search requires checking all the elements in turn when searching for the desired item, which is not always convenient.
However, Binary Search needs sorted elements, while Linear Search does not require this. Binary Search requires sorted data because it works by comparing elements and in order to know where the desired element is located very quickly, it needs sorted data.