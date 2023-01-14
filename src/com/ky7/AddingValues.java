package com.ky7;

public class AddingValues {
    public static int[] addingShifted(int[][] arrayOfArrays, int shift)
    {
        int[] resultArray = new int[arrayOfArrays[0].length + shift * (arrayOfArrays.length - 1)];

        for(int i = 0; i < arrayOfArrays.length; i++) {
            for (int j = 0; j < arrayOfArrays[i].length; j++) {
                resultArray[i * shift + j] += arrayOfArrays[i][j];
            }
        }
        return resultArray;
    }
}
