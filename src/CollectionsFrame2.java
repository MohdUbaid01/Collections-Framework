import java.util.HashSet;
import java.util.Iterator;
public class CollectionsFrame2 {
    public static void main(String[] args) {
        HashSet<String> student=new HashSet<>();

                // 2. Adding elements
                student.add("Ubaid");
                student.add("Raza");
                student.add("Ahmed");
                student.add("Sara");
                student.add("Ubaid"); // Duplicate ignored

                System.out.println("HashSet: " + student); // Output: Unordered unique elements

                // 3. Checking size
                System.out.println("Size: " + student.size());

                // 4. Checking if an element exists
                System.out.println("Contains 'Raza'? " + student.contains("Raza"));

                // 5. Removing an element
                student.remove("Ahmed");
                System.out.println("After removing 'Ahmed': " + student);

                // 6. Checking if empty
                System.out.println("Is Empty? " + student.isEmpty());

                // 7. Iterating using for-each loop
                System.out.println("Iterating using for-each loop:");
                for (String s : student) {
                    System.out.println(s);
                }

                // 8. Iterating using Iterator
                System.out.println("Iterating using Iterator:");
                Iterator<String> iterator = student.iterator();
                while (iterator.hasNext()) {
                    System.out.println(iterator.next());
                }

                // 9. Adding all elements from another collection
                HashSet<String> newStudents = new HashSet<>();
                newStudents.add("Rahul");
                newStudents.add("Zoya");
                student.addAll(newStudents);
                System.out.println("After adding new students: " + student);

                // 10. Removing all elements of another collection
                student.removeAll(newStudents);
                System.out.println("After removing new students: " + student);

                // 11. Retaining common elements
                student.add("Rahul");
                student.retainAll(newStudents);
                System.out.println("After retainAll (only common elements kept): " + student);

                // 12. Converting HashSet to Array
                String[] array = student.toArray(new String[0]);
                System.out.println("Converted Array: " + java.util.Arrays.toString(array));

                // 13. Cloning HashSet
                HashSet<String> clonedSet = (HashSet<String>) student.clone();
                System.out.println("Cloned Set: " + clonedSet);

                // 14. Clearing all elements
                student.clear();
                System.out.println("After clear: " + student);
            }
        }


    }
}
