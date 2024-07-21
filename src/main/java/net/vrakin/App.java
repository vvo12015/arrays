package net.vrakin;


import java.util.Arrays;
import java.util.Scanner;

/**
 * App for learning arrays
 * Lecture #5
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello arrays" );
        boolean notExited = true;
        try(Scanner sc = new Scanner(System.in)) {
            while (notExited){
                System.out.println("Enter number task. Basic task (1-3), additional task (4-5) or 0 to exit: ");
                int task = sc.nextInt();
                System.out.println("Enter length of array 0 to exit: ");
                int arrayLength = sc.nextInt();
                int[] array = new int[arrayLength];

                if ((arrayLength != 0)) {
                    for (int i = 0; i < arrayLength; i++) {
                        if ((task != 3) && (task != 5)) {
                            System.out.println("Enter element " + (i + 1) + " : ");
                            array[i] = sc.nextInt();
                        }else array[i] = (int) (Math.random() * 100);
                    }
                }
                switch (task){
                    case 0 -> notExited = false;
                    case 1 -> BasicTasks.evenOddNumbers(array);
                    case 2 -> System.out.println(Arrays.toString(array));
                    case 3 -> BasicTasks.generateRandomNumberArray(array);
                    case 4 -> System.out.println(Arrays.toString(AdditionalTasks.reverseArray(array)));
                    case 5 -> AdditionalTasks.rotationArrayManager(arrayLength);
                    default -> {
                        System.out.println("Invalid task");
                        notExited = false;
                    }
                }
            }
        }
    }
}


