package testing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class Lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList("Rudra", "anita", "Vikram", "Sonal", "Arjun");

        // 2. Sort using lambda expression
        names.sort((a, b) -> a.compareToIgnoreCase(b));
        
        System.out.println("Sorted Names: " + names);
        
        List<Integer> numbers = Arrays.asList(5, 2, 9, 1);

        numbers.sort((a, b) -> a - b); // ascending order
        
        System.out.println(numbers);   // Output: [1, 2, 5, 9]

        numbers.sort((a, b) -> b - a); // descending order
        System.out.println(numbers);   // Output: [9, 5, 2, 1]
        
        
        BiConsumer<String, Integer> printDetails = (name, age) -> System.out.println("Name: " + name + ", Age: " + age);

        printDetails.accept("Alice", 30); // Output: Name: Alice, Age: 30
    
        BiFunction<Integer, Integer, Integer> addNumbers = (a, b) -> a + b;

        Integer sum = addNumbers.apply(10, 20); // sum will be 30
        System.out.println("Sum: " + sum);
    
        
        
        
        String[] colorsArray = {"Red", "Green", "Blue"};
        List<String> colorsList = Arrays.asList(colorsArray);

        System.out.println("Original Array: " + Arrays.toString(colorsArray));
        System.out.println("List View: " + colorsList);

        // Modifying an element in the List
        colorsList.set(0, "Yellow");
        colorsArray[1]="Yellow1";

        System.out.println("List after modification: " + colorsList);
        System.out.println("Array after modification: " + Arrays.toString(colorsArray));


        
        

        // Call the lambda
        ArrayList<String> str= new ArrayList<String>();
        str.add("Test1");
        str.add("Test2");
        str.forEach((s) -> {System.out.println("Hello, " + s + "!");});
        
        
        
        List<String> names2 = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");

        // Filter names starting with 'A', convert to uppercase, and collect into a new list
        List<String> filteredNames = names2.stream()
                                          .filter(name -> name.startsWith("A"))
                                          .map(String::toUpperCase)
                                          .collect(Collectors.toList());

        System.out.println(filteredNames); // Output: [ALICE]
        
        
        
        }

}
