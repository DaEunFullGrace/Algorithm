public class Main {
    public static void main(String[] args){
        int[] list = {69, 10, 30, 2, 16, 8, 31, 22};

//        SelectionSort s = new SelectionSort();
//        InsertionSort i = new InsertionSort();
//        BubbleSort b = new BubbleSort();
//        MergeSort m = new MergeSort();
//        QuickSort q = new QuickSort();
//        HeapSort h = new HeapSort();
//
//        System.out.print("Selection Sort : ");
//        s.sort(list);
//        s.printArr();
//
//        System.out.print("Insertion Sort : ");
//        i.sort(list);
//        i.printArr();
//
//        System.out.print("Bubble Sort : ");
//        b.sort(list);
//        b.printArr();
//
//        System.out.print("Merge Sort : ");
//        m.sort(list, 0, list.length-1);
//        m.printArr();
//
//        System.out.print("Quick Sort : ");
//        q.sort(list, 0, list.length-1);
//        q.printArr();
//
//        System.out.print("Heap Sort : ");
//        h.sort(list);
//        h.printArr();

        Sort s = new Sort();

        s.bubbleSort(list);

    }
}