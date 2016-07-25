// Using java solve the problem below:

//Create your own array of integers
// Find the maximum and minimum of this array that you just created.
// create a variable to hod the maximum
// create a variable to hold the minimum
// take in the array of numbers
// begin to loop through them
// put the lowest in its array 
// put the highest in its array
// output the highest then output the lowest

import java.util.Arrays;
public class Maximum_Minimum {

    /**
     * @param args the command line arguments
     */
    public static int[] sortArray(int[] array) {
        int list = 0;
        
        for(int i = 0;i < array.length-1;i++) {
            for(int j =0;j<array.length-1;j++) {
                if(array[j] > array[j+1]) {
                    list = array[j+1];
                    array[j+1] = array[j];
                    array[j] = list;
                }
            }
        }
        return array;
    }
    
        
    
    public static void main(String[] args) {
        int[] numbers = { 5, 8, 14, 1, 5678, -568};
        sortArray(numbers);
        int[] max = {numbers[numbers.length-1]};
        int[] min = {numbers[0]};
        
        System.out.println(Arrays.toString(min));
        System.out.println(Arrays.toString(max));
        
    }
    
}
