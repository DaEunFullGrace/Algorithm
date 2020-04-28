
public class Sort implements ISort{

    @Override
    public void bubbleSort(int[] a) {
        for(int i = a.length -1 ; i > 0; i--){
            for(int j = 0; j < i; j++){
                if(a[j+1] < a[j])
                    swap(a, j,j+1);
            }
        }
        System.out.print("Bubble Sort : " );
        printAll(a);
    }

    @Override
    public void mergeSort(int[] a, int p, int r) {

    }

    @Override
    public void quickSort(int[] a, int p, int r) {

    }

    @Override
    public void heapSort(int[] a) {

    }

    @Override
    public void swap(int[] a, int i, int j) {
        int tmp = a[i];

        a[i] = a[j];
        a[j] = tmp;
    }

    @Override
    public void printAll(int[] a) {
        for(int i=0; i < a.length; i++){
            System.out.print(a[i] + "  ");
        }
        System.out.println();
    }
}
