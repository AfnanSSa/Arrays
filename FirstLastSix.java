/*Given an array of ints, return true if 6 appears as either the first
or last element in the array. The array will be length 1 or more.

firstLast6([1, 2, 6]) → true
firstLast6([6, 1, 2, 3]) → true
firstLast6([13, 6, 1, 2, 3]) → false*/

import java.util.Arrays;

public class ArrayTask {
    public static void main(String[] args){
        int[] firstArray= {1, 2, 6}; // output: Array 1 is true
        int[] secondArray={6, 1, 2, 3}; // output: Array 2 is true
        int[] thirdArray={13, 6, 1, 2, 3}; // output: Array 3 is false

       if (firstArray[0]==6 || firstArray[firstArray.length-1] == 6){
           System.out.println("\nArray 1 is true");
       } else{
           System.out.println("\nArray 1 is false");
       }
       if (secondArray[0]==6 || secondArray[secondArray.length-1] == 6){
            System.out.println("\nArray 2 is true");
        } else{
            System.out.println("\nArray 2 is false");
        }
       if (thirdArray[0]==6 || thirdArray[thirdArray.length-1] == 6){
            System.out.println("\nArray 3 is true");
       } else{
            System.out.println("\nArray 3 is false");
       }

    }
}
