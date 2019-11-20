package com.launchcode.java;
import java.util.Random;


public class ExceptionsPractice {

    public static void main(String[] args) {
	// write your code here
    //System.out.println("The following is a runtime (unchecked) exception: ");
    //int[] runtimeCheckedArray = new int [20];
    //System.out.println(runtimeCheckedArray[20]);

        System.out.println("Array size is random number between 0 and 20");
        System.out.println("So there will be an exception about half of the time.\"");

        //create instance of random class
        Random ra = new Random();

        //generate random integers in range of 0 to 20

        int b = ra.nextInt(20);
        try{
            int[]d = new int[b];
            System.out.println("Element 10 at index " + b + " = " + d[10]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception thrown" + e);
        }
        finally {       //finally means print this no matter what happens   
            System.out.println("Finally finished try-catch");
        }

    }

}
