public class MergeSort {
    int[] arr;

    public void sort(int[] input, int p, int r){
        arr = input;

        if(p < r){
            int middle = (p + r) / 2;

            sort(arr, p, middle);
            sort(arr, middle + 1, r);

            merge(arr, p, middle, r);
        }
    }

    private void merge(int[] arr, int p, int middle, int r){
        int i = p;
        int j = middle + 1;
        int k = p;
        int[] sorted = new int[arr.length];

        while(i <= middle && j <= r){
            if(arr[i] <= arr[j]){
                sorted[k++] = arr[i++];
            } else{
                sorted[k++] = arr[j++];
            }
        }

        while(i <= middle){
            sorted[k++] = arr[i++];
        }

        while(j <= r){
            sorted[k++] = arr[j++];
        }

        for(int m = p; m <= r; m++){
            arr[m] = sorted[m];
        }

    }

    public void printArr(){
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
    }

}
