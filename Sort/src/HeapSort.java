public class HeapSort {
    int[] arr = {1, 5, 2, 3, 55};

    public void sort(int[] input){
        arr = input;

        //make heap
        heapify(arr, arr.length);

        //배열의 크기만큼 반복
        for(int idx = arr.length-1; idx > 0; idx--){
            swap(arr, 0, idx);
            heapify(arr, idx);
        }
    }

    private void heapify(int[] arr, int arrLength){
        //root 노드는 제외(부모가 없음)
        for(int idx=1; idx < arrLength; idx++){

            int child = idx;

            while(child > 0){
                int parent = (child-1)/2;

                if(arr[child] > arr[parent])    //최대 heap
                    swap(arr, child, parent);

                child = parent;
            }
        }
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
