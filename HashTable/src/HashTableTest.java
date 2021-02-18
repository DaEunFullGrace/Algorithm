import java.util.Hashtable;

public class HashTableTest {
    public static void main(String[] args){
        Hashtable<String, String> hashTable = new Hashtable<String, String>();
        hashTable.put("Jan", "010-0000-0000");
        System.out.println(hashTable.get("Jan"));

        HashTable_Chaining<String, String> ht = new HashTable_Chaining<>(100);

        ht.put("name", "0000");
        System.out.println(ht.get("name"));

        HashTable_Chaining<Integer, Integer> ht2 = new HashTable_Chaining<>(40);

        ht2.put(100, 10);
        System.out.println(ht2.get(100));

        HashTable_Chaining<Character, Character> ht3 = new HashTable_Chaining<>(10);

        ht3.put('c', 'a');
        System.out.println(ht3.get('c'));
    }
}
