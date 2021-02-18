import java.util.Hashtable;

public class HashTable_API {
    public static void main(String[] args){
        Hashtable<String, String> hashTable = new Hashtable<String, String>();
        hashTable.put("Jan", "010-0000-0000");
        System.out.println(hashTable.get("Jan"));
    }
}
