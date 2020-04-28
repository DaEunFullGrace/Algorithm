public class InsertionSort {
    int[] list;

    public void sort(int[] input){
        list = input;

        for(int i=1; i<list.length; i++){
            for(int j=0; j<i; j++){
                if(list[j] < list[i] && list[j+1] > list[i])
                    swap(list, j+1, i);
            }
        }
    }

    private void swap(int[] a, int i, int j){
        int tmp = a[i];

        a[i] = a[j];
        a[j] = tmp;
    }

    public void printArr(){
        for(int i=0; i < list.length; i++){
            System.out.print(list[i] + "  ");
        }
        System.out.println();
    }
}
