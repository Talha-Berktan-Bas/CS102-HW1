import java.util.Random;
import java.util.Scanner;

/**
 * Homework
 */
public class Homework {

    public static void main(String[] args) {
        //implements the requested task by the user 
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
       
        //runs the code unless user write exit 
        while(! userInput.equalsIgnoreCase("exit")){
            
            //display menu
            System.out.println("Choose your option");
            System.out.println("1- Find the Min and Max of the array");

            if(userInput.equals("1")){

            }
            else if(userInput.equals("2")){

            }
            else if(userInput.equals("3")){
                
            }
            
            scanner.close();
        }
    }

    /**
     * Creates a random int array with given size whose elements are between 1 and 100.
     * @param size size of the array
     * @return a random int array
     */
    public static int[] randomArray(int size) {
        int[] randomArray = new int[size];
        Random generator = new Random();
        for (int i = 0; i < size; i++) {
            randomArray[i] = generator.nextInt(100) + 1;
        }
        return randomArray;
    }

    /**
     * Find the sum of elements with odd- and even-numbered indexes
     * @param array
     * @return new array with the index 0 shows sum of evens. index 1 shows sum of odds
     */
    public static int[] evenOdd(int[] array){
        int sumEven=0;
        int sumOdd=0;
        for(int i=0;i<array.length;i++){
            if(array[i]%2==0){
                sumEven+=array[i];
            }
            else{
                sumOdd+=array[i];
            }
        }
        int[] arr=new int[2];
        arr[0]=sumEven;
        arr[1]=sumOdd;
        return arr;
        
    }

    /**
     * Finds the minimum of the array
     * @param array that going to be checked 
     * @return min value as integer
     */
    public static int findMin(int[]array) {
        int min = array[0];
        for(int i = 1; i < array.length; i++){
            if (array[i]<min) {
                min = array[i];
            }
        }
        return min;
    }

     /**
     * Finds the maximum of the array
     * @param array that going to be checked 
     * @return max value as integer
     */
    public static int findMax(int[]array) {
        int max = array[0];
        for(int i = 1; i < array.length; i++){
            if (array[i]>max) {
                max = array[i];
            }
        }
        return max;
    }
    
}
