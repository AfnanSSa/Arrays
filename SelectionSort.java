/* Implement Selection Sort in Java
* Objective:
* Develop a Java program that implements the Selection Sort algorithm to sort an array of integers in ascending order.
* Requirements:
* The program should define an integer array with hardcoded values for sorting.
* Implement the Selection Sort algorithm to sort the array in ascending order.
* The sorting logic should be encapsulated in a method named selectionSort.
* After sorting, the array should be printed to the console to display the sorted order.*/
import java.util.Arrays;

public class SelectionSort {
    public static void main (String[] args){
        //creating an array with elements
        Integer [] originalArray = {12, 90, 34, 2, 45, 3, 22, 18, 5, 78};

        //printing the original array
        System.out.print("\nOriginal array: ");
        printArray(originalArray);

        //soring array
        sortArray(originalArray);

        //printing sorted array
        System.out.print("\nSorted array: ");
        printArray(originalArray);
    }

    //method to sort array
    public static void sortArray(Integer[] originalArray){
        Integer arraySize = originalArray.length;

        //iterating through array
        for (Integer i = 0; i<arraySize-1; i++){
            Integer minimum = i; //assuming current index has the minimum value

            //looking for a smaller value
            for (Integer j=i; j<arraySize-1; j++){
                //if smaller value was found
                if (originalArray[j] < originalArray[minimum]){
                    minimum = j; //update value of minimum (new minimum value)
                }
            }
            //swapping the smallest found element with the first unsorted position
            Integer temporary =  originalArray[minimum];
            originalArray[minimum] = originalArray[i];
            originalArray[i] = temporary;
        }
    }

    //method to print array
    public static void printArray(Integer[] originalArray){
        System.out.println(Arrays.toString(originalArray));
    }
}
