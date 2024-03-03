/* Running Sum of 1d Array
* Objective: Calculate the running sum of an array.
* Explanation: The task is to iteratively add each element of the array to the
* sum of all previous elements. This problem is fundamental in teaching iteration
* and accumulation of values in an array, a common task in data processing.
*
* Analogy: Imagine you're playing a video game where you collect coins. Each step
* you take, you might grab some coins, and you want to know how many coins you have
* at each step. So, you start with zero, and every time you pick up more coins, you
* add them to your total so far. This way, you can always see how many coins you've
* got at any point in your adventure.
*
* Sample Input/Output
* Input: [1, 2, 3, 4]
* Output: [1, 3, 6, 10]*/

import java.util.Arrays;

public class ArraySum {
    public static void main(String[] args) {
        //variable declaration
        //creating an array with elements
        int[] numArray = {1, 2, 3, 4};
        int sum = 0;
        int[] resultArray = new int[numArray.length]; //array to store the new values
        //iterate through array
        for (int i = 0; i < numArray.length; i++) {
            sum = sum + numArray[i]; //adding index to the sum
            resultArray[i] = sum; //storing sum in result array
        }
        //printing result
        System.out.println("Result is " + Arrays.toString(resultArray));
    }
}
