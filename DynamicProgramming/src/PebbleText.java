public class PebbleText {
    public static void main(String[] args){

        int[][] data = { {6, 7, 12, 15, 5, 3, 11, 3},
                {-8, 10, 14, 9, 7, 13, 8, 5}, {11, 12, 7, 4, 8, -2, 9 ,4} };
        int[][] pattern = {{1, 2}, {0, 2, 3}, {0, 1}, {1}};

        PebbleGame pg = new PebbleGame(data, pattern);
        System.out.println(pg.pebble());

        for(int[] ints : pg.getResult()) {
            for(int i : ints){
                System.out.print(i + "   ");
            }
            System.out.println();
        }
    }
}
