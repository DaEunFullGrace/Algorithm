public class MatrixPathPlanning {
    int[][] m;

    public int rCounter = 0;
    public int dpCounter = 0;

    public MatrixPathPlanning(int[][] m){
        this.m = m;
    }

    // recursively
    public int rPathPlanning(int i, int j){
        rCounter++;

        if(i == 0 && j == 0){
            return m[i][j];
        } else if(i == 0 && j != 0){
            return m[i][j] + rPathPlanning(i, j-1);
        } else if(i != 0 && j == 0){
            return m[i][j] + rPathPlanning(i-1, j);
        }else {
            return m[i][j] + max(rPathPlanning(i-1, j), rPathPlanning(i, j-1), rPathPlanning(i-1, j-1));
        }
    }

    // dynamic programming
    public int dpPathPlanning(int x, int y){
        int[][] c = new int[m.length][m[0].length];
        c[1][1] = m[1][1];

        for(int i=1; i< m.length; i++){
            for(int j=1; j<m.length; j++){
                dpCounter++;
                c[i][j] = m[i][j] + max(c[i-1][j], c[i][j-1], c[i-1][j-1]);
            }
        }

        return c[x][y];
    }

    public int max(int a, int b, int c){
        if(a>b){
            return Math.max(a, c);
        } else {
            return Math.max(b, c);
        }
    }

}
