public class Main5 {
    public static void main(String[] args) {
        int[][] arrayOfArrays;
        arrayOfArrays = new int[5][5];

        arrayOfArrays[0][0] = 1;
        arrayOfArrays[0][1] = 2;
        arrayOfArrays[0][2] = 3;
        arrayOfArrays[0][3] = 4;
        arrayOfArrays[0][4] = 5;

        arrayOfArrays[1][0] = 6;
        arrayOfArrays[1][4] = 10;

        int[][] anotherArrayOfArrays = {
                {1, 2, 3},
                {4, 5, 6},
                {5},
                {1, 2, 3, 4}
        };


        for (int[] arr : anotherArrayOfArrays) {
            for (int elem : arr) {

            }
        }


        for (int i=0; i<anotherArrayOfArrays.length; i++) {
            for (int j=0; j<anotherArrayOfArrays[i].length; j++) {

            }
        }
    }
}
