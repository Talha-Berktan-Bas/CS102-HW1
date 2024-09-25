import java.util.Random;

/**
 * Homework
 */
public class Homework {

    public static void main(String[] args) {
        
    }

    public static int[] randomArray(int size) {
        int[] randomArray = new int[size];
        Random generator = new Random();
        for (int i = 0; i < size; i++) {
            randomArray[i] = generator.nextInt(100) + 1;
        }
        return randomArray;
    }
}