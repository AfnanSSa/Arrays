/* Find All Subsets of a Set
* Objective: Implement a function in Java that iteratively generates all possible
* subsets of a given set of distinct integers, also known as the power set. The
* function must ensure that the solution set does not contain any duplicate subsets
* and includes the empty set, the set itself, and all possible combinations of its elements.
* Requirements:
* Input: A set of distinct integers.
* Output: A list of all subsets, where each subset is represented as a list of integers.
* The solution must account for all subsets, ranging from the empty set to the full input set, without producing duplicate subsets.
* The subsets within the solution set do not need to be in any specific order, but each subset should maintain the original order of elements as they appeared in the input set.
* Implement an iterative approach, avoiding the use of recursion.*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsOfSet {
    public static void main (String[] args){
        Integer [] numArray = {1,2,3}; //array of integers
        System.out.println("\nOriginal Array Set: " + Arrays.toString(numArray));
        System.out.println("Subsets: " + generateSubsets(numArray));
    }
    //method to find and print subsets
    public static List<List<Integer>> generateSubsets(Integer [] numArray){
        List<List<Integer>> powerSet = new ArrayList<>(); //creating array list to store subset
        powerSet.add(new ArrayList<>()); //adding the empty set

        //iterating through each element in the list
        for (Integer number : numArray){
            //creating array list to store new subsets created with the current element
            List<List<Integer>> newSubsets = new ArrayList<>();

            //iterating through each existing subset
            for (List<Integer> element : powerSet){
                //creating a new subset by adding the current element to each existing subset
                List<Integer> subSet= new ArrayList<>(element);
                subSet.add(number);
                //adding the new subset to the subsets list
                newSubsets.add(subSet);
            }
            //adding all subsets to the power subset
            powerSet.addAll(newSubsets);
        }
        return powerSet; //returning the power set
    }
}
