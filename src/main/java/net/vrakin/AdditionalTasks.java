package net.vrakin;

import java.util.Arrays;

/**
 * App
 */

public class AdditionalTasks {
    public static int[] reverseArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            change(array, i, array.length - i - 1);
        }

        return array;
    }

    public static void rotationArrayManager(int length) {
        int[][] array = new int[length][length];
        int[][] arrayForRotation90 = new int[length][length];
        int[][] arrayForRotation180 = new int[length][length];
        int[][] arrayForRotation270 = new int[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                array[i][j] = (i)*10 + (j);
                arrayForRotation90[i][j] = (i)*10 + (j);
                arrayForRotation180[i][j] = (i)*10 + (j);
                arrayForRotation270[i][j] = (i)*10 + (j);
            }
        }

        rotationArray(arrayForRotation90, Rotation.ANGLE90);
        for (int[] ints : arrayForRotation90) {
            System.out.println("Array by 90" + Arrays.toString(ints));
        }
        rotationArray(arrayForRotation180, Rotation.ANGLE180);
        for (int[] ints : arrayForRotation180) {
            System.out.println("Array by 180" + Arrays.toString(ints));
        }
        rotationArray(arrayForRotation270, Rotation.ANGLE270);
        for (int[] ints : arrayForRotation270) {
            System.out.println("Array by 180" + Arrays.toString(ints));
        }
    }

    private static void rotationArray(int[][] array, Rotation rotation){
        int countRepeat = 0;
        switch (rotation) {
            case ANGLE90 ->  countRepeat = 1;
            case ANGLE180 -> countRepeat = 2;
            case ANGLE270 -> countRepeat = 3;
            default -> throw new IllegalStateException("Unexpected value: " + rotation);
        }
        for (int i = 0; i < countRepeat; i++) {
            turn90(array);
        }
    }

    private static void turn90(int[][] array) {
        int endIndex = array.length - 1;
        for (int i = 0; i < array.length/2; i++) {
            for (int j = i; j < endIndex -i; j++) {
                int temp = array[i][j];
                array[i][j] = array[endIndex -j][i];
                array[endIndex -j][i] = array[endIndex -i][endIndex -j];
                array[endIndex -i][endIndex -j] = array[j][endIndex -i];
                array[j][endIndex -i] = temp;
            }
        }
    }

    private static void change(int[] array, int i1, int i2) {
        int temp = array[i1];
        array[i1] = array[i2];
        array[i2] = temp;
    }
}
