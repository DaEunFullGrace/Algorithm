public class BubbleSort {
    int[] a;

    public void sort(int[] input){
        a = input;

        for(int i = a.length -1 ; i > 0; i--){
            for(int j = 0; j < i; j++){
                if(a[j+1] < a[j])
                    swap(a, j,j+1);
            }
        }
    }

    private void swap(int[] a, int i, int j){
        int tmp = a[i];

        a[i] = a[j];
        a[j] = tmp;
    }

    public void printArr(){
        for(int i=0; i < a.length; i++){
            System.out.print(a[i] + "  ");
        }
        System.out.println();
    }
}
