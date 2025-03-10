import java.util.*;
import java.util.Collections;

public class CollectionsFrame {
    public static void main(String[] args) {
        //  Creating an ArrayList with List Interface (Best Practice)
        List<String> list = new ArrayList<>();

        //  Adding elements to the list
        list.add("Ubaid"); // index 0
        list.add("wants"); // index 1
        list.add("to"); // index 2
        list.add("explore"); // index 3
        list.add("New Zealand"); // index 4
        System.out.println("Initial List: " + list);

        // ✅ Adding an element at a specific index
        list.add(2, "definitely");
        System.out.println("After adding 'definitely' at index 2: " + list);

        // ✅ Getting an element at a specific index
        System.out.println(list.get(3)+"directly in SOUT");
        String word = list.get(3);
        System.out.println("Element at index 3: " + word);

        // ✅ Updating an element at a specific index
        list.set(1, "is eager");
        System.out.println("After updating index 1: " + list);

        // ✅ Removing an element by index
        list.remove(3);
        System.out.println("After removing element at index 3: " + list);

        // ✅ Removing an element by value
        list.remove("New Zealand");
        System.out.println("After removing 'New Zealand': " + list);

        // ✅ Checking if an element exists in the list
        boolean hasExplore = list.contains("explore");
        System.out.println("Does list contain 'explore'? " + hasExplore);

        // ✅ Getting the size of the list
        System.out.println("Size of list: " + list.size());

        // ✅ Checking if the list is empty
        System.out.println("Is list empty? " + list.isEmpty());

        // ✅ Sorting the list in ascending order (Alphabetical)
        Collections.sort(list);
        System.out.println("Sorted List (Ascending Order): " + list);

        // ✅ Sorting the list in descending order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Sorted List (Descending Order): " + list);

        // ✅ Iterating through the list using a for loop
        System.out.print("Using For Loop: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // ✅ Iterating through the list using an enhanced for loop
        System.out.print("Using Enhanced For Loop: ");
        for (String str : list) {
            System.out.print(str + " ");
        }
        System.out.println();

        // ✅ Iterating through the list using an iterator
        System.out.print("Using Iterator: ");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // ✅ Clearing all elements from the list
        list.clear();
        System.out.println("After clearing the list: " + list);

        // ✅ Checking if the list is empty after clearing
        System.out.println("Is list empty after clearing? " + list.isEmpty());
    }
}

/*add(E e)	-Adds an element at the end
add(int index, E e)-	Inserts an element at a specific index
get(int index)-	Fetches an element from the list
set(int index, E e)	Updates an element at a specific index
remove(int index)-	Removes an element from a specific index
remove(Object o)-	Removes a specific element
contains(Object o)	-Checks if an element exists in the list
size()-	Returns the number of elements in the list
isEmpty()-	Checks if the list is empty
clear()-	Removes all elements from the list
Collections.sort(list)	Sorts the list in ascending order
Collections.sort(list, Collections.reverseOrder())	Sorts the list in descending order
Iterator	Used for iterating through the list
*/