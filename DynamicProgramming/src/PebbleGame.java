public class PebbleGame {

    private int[][] data;
    private int[][] pattern = {{1, 2}, {0, 2, 3}, {0, 1}, {1}};
    private int[][] result;

    public PebbleGame(int[][] data, int[][] pattern){
        this.data = data;
        this.pattern = pattern;
    }

    public int pebble(){
        result = new int[pattern.length][data[0].length];

        for(int p=0; p<pattern.length; p++){
            result[p][0] = w(0, p);
        }

        int maxC = 0;

        for(int col = 1; col < data[0].length; col++){
            maxC = Integer.MIN_VALUE;

            for(int p=0; p<pattern.length; p++){
                int[] q = pattern[p];
                result[p][col] = max(data, col-1, q) + w(col, p);

                if(result[p][col] > maxC)
                    maxC = result[p][col];
            }
        }

        return maxC;
    }

    // 패턴에 따른 값을 리턴
    private int w(int col, int p){
        int val = 0;

        switch (p) {
            case 0:
                val = data[0][col];
                break;
            case 1:
                val = data[1][col];
                break;
            case 2:
                val = data[2][col];
                break;
            case 3:
                val = data[0][col] + data[2][col];
                break;

            default:

        }

        return val;
    }

    private int max(int[][] peb, int col, int[] q) {
        int tmp = Integer.MIN_VALUE;

        for(int i=0; i<q.length; i++){
            if(result[q[i]][col] > tmp){
                tmp = result[q[i]][col];
            }
        }

        return tmp;
    }

    public int[][] getResult(){
        return result;
    }
}
