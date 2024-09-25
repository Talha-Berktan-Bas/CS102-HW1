import java.util.Random;

/**
 * Homework
 */
public class Homework {

    public static void main(String[] args) {
        
    }

    /**
     * Creates a raondom int array with given size whose elements are between 1 and 100.
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
}