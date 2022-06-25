package Module1.Lesson8;

import java.util.Arrays;

public class Stereo {
    public static void main(String[] args) {

        //   int[][] ar1 = new int[4][4];
        int[] ar1 = {5,2,10,-1,99};
        int[] ar2 = new int[5];

        System.out.println(Arrays.toString(ar1));
        System.out.println(Arrays.toString(ar2));

        System.arraycopy(ar1, 0, ar2, 0, 5);

        for (int i = 0; i < ar1.length; i++) {
            ar2[i] = ar1[i];
        }

        System.out.println(Arrays.toString(ar2));

// МНОГОЭТАЖНАЯ ПАРКОВКА


        int[][] months = {  // 0   1    2
                {31, 31, 28},   // 0

                {30, 31, 30},   // 1

                {30, 30, 20},   // 2

                {30, 222, 10},   // 3
        } ;

        System.out.println(Arrays.deepToString(months));


//
//        for (int i = 0; i < months.length; i++) {
//            System.out.println(months[i]);
//        }



//        for (int i = 0; i < months.length; i++) {
//            for (int j = 0; j < months[i].length; j++) {
//                System.out.println(months[i][j]);
//            }
//        }



        int[][] matrix = new int[3][];
        matrix[0] = new int[1];
        matrix[1] = new int[5];
        matrix[2] = new int[2];


    }

}

