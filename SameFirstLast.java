/*Given an array of ints, return true if the array is length 1
or more, and the first element and the last element are equal.

sameFirstLast([1, 2, 3]) → false
sameFirstLast([1, 2, 3, 1]) → true
sameFirstLast([1, 2, 1]) → true*/

import java.util.Scanner;

public class ArrayTask {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array's elements separated  by a space: ");
        String input = scanner.nextLine();
        String[] stringArray = input.split(" ");
        int[] integerArray = new int[stringArray.length];

        //converting string array to integer array using parseInteger
       for(int i=0; i< stringArray.length; i++){
            integerArray[i] = Integer.parseInt(stringArray[i]);
       }

       boolean sameFirstLast = false;
       //checking if array length is more than zero & first element is equal to last element
       if (integerArray.length>=1 && integerArray[0] == integerArray[integerArray.length-1]){
           sameFirstLast = true;
       }
       System.out.println("\n" + sameFirstLast);

    }
}
