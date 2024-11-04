import java.util.ArrayList; // importing the interfaces from the java.util package I need
import java.util.List;
import java.util.function.UnaryOperator;

/**
 * The {@code replace} class demonstrates the usage of the {@code replaceAll} method 
 * in an {@code ArrayList} to apply a transformation on each element in the list.
 * In this example, each integer in the list is squared.
 */
public class replace {
    
    /**
     * The main method of the {@code replace} class. This method creates an 
     * {@code ArrayList} of integers, squares each element using a {@code UnaryOperator}, 
     * and prints the original and modified lists.
     * 
     * @param args command-line arguments (not used in this program)
     */
    public static void main(String[] args) {
        // Create an ArrayList of integers
        List<Integer> numbers = new ArrayList<>();
        // Add some numbers to the list
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        // Print the original list
        System.out.println("Original numbers: " + numbers);

        // Define a UnaryOperator to square each number
        // a UnaryOperator is a special kind of function that can perform an operation on each number
        UnaryOperator<Integer> square = n -> n * n; // making the unary operator square each number

        // Use replaceAll to square each number in the list
        numbers.replaceAll(square);

        // Print the modified list
        System.out.println("After replaceAll (squared numbers): " + numbers);
    }
}
