package net.vrakin;

import java.util.Arrays;

public class BasicTasks {

    public static void evenOddNumbers(int[] array) {
        int counterEven = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                counterEven++;
            }
        }

        System.out.println("Count of even number: " + counterEven);
        System.out.println("Count of odd number: " + (array.length - counterEven));
    }


    public static void generateRandomNumberArray(int[] array) {
        int[] generatedArray = new int[array.length*2];
        for (int i = 0; i < array.length; i++) {
            generatedArray[i] = array[i];
            generatedArray[array.length+i] = array[i]*2;
        }
        System.out.println(Arrays.toString(generatedArray));
    }
}
