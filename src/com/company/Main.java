package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        int[] numbers = {1, 7, 23, 45, 48, 67, 87};
        String again;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the search number");
            int search = input.nextInt();
            int result = binearySearch(numbers, 0, numbers.length - 1, search);
            if (result==-1)
                System.out.println("result was not found");
             else {
                System.out.println("the position of number is " + "at element " + result);
            }
            System.out.println("do you want to  continue? Yes or N0");
            again= input.next();

        } while (again.equalsIgnoreCase("yes"));
    }

    //the binary search array performs binary search in int array.

    public static int binearySearch( int array[], int first, int last, int value){

        int middle;


        if (first > last )
            return -1;

        middle= (first+last)/2;

        if (array[middle]== value)
            return  middle;

        else if(array[middle]<value)
            return binearySearch(array,middle+1, last, value);
        else
            return binearySearch(array,first,middle-1, value);

    }
}
