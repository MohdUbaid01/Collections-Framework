import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMape {
    public static void main(String[] args) {
        // HashMap (Unordered)
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(3, "C");
        hashMap.put(1, "A");
        hashMap.put(2, "B");
        System.out.println("HashMap: " + hashMap);

        // LinkedHashMap (Insertion Order)
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(3, "C");
        linkedHashMap.put(1, "A");
        linkedHashMap.put(2, "B");
        System.out.println("LinkedHashMap: " + linkedHashMap);

        // TreeMap (Sorted by Key)
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "C");
        treeMap.put(1, "A");
        treeMap.put(2, "B");
        System.out.println("TreeMap: " + treeMap);



          HashMap<Integer, String> map = new HashMap<>();

            // 2️⃣ Adding elements using put()
            map.put(101, "John");
            map.put(102, "Alice");
            map.put(103, "Bob");
            map.put(104, "Charlie");

            System.out.println("Original HashMap: " + map);

            // 3️⃣ Getting a value using get()
            System.out.println("Value for key 102: " + map.get(102)); // Alice

            // 4️⃣ Checking if a key exists using containsKey()
            System.out.println("Contains key 103? " + map.containsKey(103)); // true

            // 5️⃣ Checking if a value exists using containsValue()
            System.out.println("Contains value 'David'? " + map.containsValue("David")); // false

            // 6️⃣ Removing an entry using remove()
            map.remove(104);
            System.out.println("After removing key 104: " + map);

            // 7️⃣ Iterating over keys using keySet()
            System.out.println("Keys:");
            for (Integer key : map.keySet()) {
                System.out.println(key);
            }

            // 8️⃣ Iterating over values using values()
            System.out.println("Values:");
            for (String value : map.values()) {
                System.out.println(value);
            }

            // 9️⃣ Iterating over key-value pairs using entrySet()
            System.out.println("Key-Value Pairs:");
            for (Map.Entry<Integer, String> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }

            // 🔟 Updating a value using put()
            map.put(103, "Robert");
            System.out.println("After updating key 103: " + map);

            // 1️⃣1️⃣ Checking the size of the HashMap
            System.out.println("Size of HashMap: " + map.size());

            // 1️⃣2️⃣ Checking if the HashMap is empty
            System.out.println("Is HashMap empty? " + map.isEmpty());

            // 1️⃣3️⃣ Clearing all elements using clear()
            map.clear();
            System.out.println("After clear(): " + map);
        }
    }


