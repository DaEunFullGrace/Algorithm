public class Fibonacci {

    public static int RCounter = 0;
    public static int DPCounter = 0;

    public int getRecursively(int n){
        RCounter++;

        if(n >= 3) {
            return getRecursively(n-1) + getRecursively(n-2);
        }
        else {
            return 1;
        }

    }

    public int getDynamically(int n){

        int[] data = new int[n];

        data[0] = 1;
        data[1] = 1;

        for(int i=2; i<n; i++){
            DPCounter++;
            data[i] = data[i-1] + data[i-2];
        }

        return data[n-1];
    }

}
