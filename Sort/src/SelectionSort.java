public class SelectionSort {
    int[] inpList;

    public void sort(int[] input){
        inpList = input;

        for(int i = inpList.length-1; i > -1; i--){

            int maxIdx = i;

            for(int j= i ; j > -1; j--){

                if(inpList[j] > inpList[maxIdx]) {
                    maxIdx = j;
                }
            }

            swap(inpList, maxIdx, i);
        }
    }

    private void swap(int[] a, int i, int j){
        int tmp = a[i];

        a[i] = a[j];
        a[j] = tmp;
    }

    public void printArr(){
        for(int i=0; i < inpList.length; i++){
            System.out.print(inpList[i] + "  ");
        }
        System.out.println();
    }

}
