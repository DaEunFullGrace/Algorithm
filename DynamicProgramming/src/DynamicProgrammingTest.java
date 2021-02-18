public class DynamicProgrammingTest {
    public static void main(String[] args){

//        Fibonacci fb = new Fibonacci();
//
//        System.out.println(fb.getRecursively(30));
//        System.out.println(fb.getDynamically(30));
//
//        System.out.println("Recursively : " + fb.RCounter);
//        System.out.println("Dynamically : " + fb.DPCounter);

        int[][] matrix = { {0, 0, 0, 0, 0}, {0, 6, 7, 12, 5}, {0, 5, 3, 11, 8},
                {0, 7, 17, 3, 3,}, {0, 8, 10, 14, 9} };

        MatrixPathPlanning mpp = new MatrixPathPlanning(matrix);

        System.out.println("재귀적 실행 결과: " + mpp.rPathPlanning(4, 4));
        System.out.println("동적 프로그래밍 실행 결과: " + mpp.dpPathPlanning(4, 4));

        System.out.println("재귀적으로 반복한 횟수 : " + mpp.rCounter);
        System.out.println("동적 프로그래밍으로 실행했을 때 반복한 횟수 : " + mpp.dpCounter);
    }
}
