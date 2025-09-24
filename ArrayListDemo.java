import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {

        // 1. Create ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // 2. Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        System.out.println("After adding elements: " + fruits);

        // 3. Access element by index
        System.out.println("Element at index 1: " + fruits.get(1));

        // 4. Update element
        fruits.set(1, "Orange"); 
        System.out.println("After updating index 1: " + fruits);

        // 5. Remove elements
        fruits.remove("Apple");   // remove by value
        System.out.println("After removing 'Apple': " + fruits);

        fruits.remove(1);         // remove by index
        System.out.println("After removing element at index 1: " + fruits);

        // 6. Size of ArrayList
        System.out.println("Size of ArrayList: " + fruits.size());

        // 7. Check if element exists
        System.out.println("Contains Mango? " + fruits.contains("Mango"));

        // 8. Loop using for-each
        System.out.println("Looping with for:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

    }
}
