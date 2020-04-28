public class QuickSort {
    int[] arr;

    public void sort(int[] input, int startPoint, int endPoint){
        arr = input;

        if(startPoint < endPoint) {
            int pivot = partitioning(arr, startPoint, endPoint);
            sort(arr, startPoint, pivot - 1);
            sort(arr, pivot + 1, endPoint);
        }
    }

    private int partitioning(int[] arr, int startPoint, int endPoint){
        int tmpPivot = arr[(startPoint+endPoint)/2];

        while(startPoint < endPoint){
            //교차하지 않을 동안
            while((arr[startPoint] < tmpPivot)){
                startPoint++;
            }

            while((arr[endPoint] > tmpPivot)){
                endPoint--;
            }

            if(startPoint < endPoint) {
                swap(arr, startPoint, endPoint);
//                startPoint++;
                endPoint--;
            }
        }

        return startPoint;
    }

    private void swap(int[] a, int i, int j){
        int tmp = a[i];

        a[i] = a[j];
        a[j] = tmp;
    }

    public void printArr(){
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
    }
}
