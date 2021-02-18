import java.util.LinkedList;

public class HashTable_Chaining<E1, E2> {

    private LinkedList<Node<E1, E2>>[] hashTable;

    public HashTable_Chaining(int size){
        hashTable = new LinkedList[size];
    }

    private int hashFunction(E1 key){
        int hashCode = 0;

        String sKey = key.toString();

        for (char c : sKey.toCharArray()) {
            hashCode += c;
        }

        return hashCode % hashTable.length;
    }

    public void put(E1 key, E2 value){
        int idx = hashFunction(key);

        Node<E1, E2> newNode = new Node<>(key, value);

        if(hashTable[idx] == null){
            hashTable[idx] = new LinkedList<>();
        }

        hashTable[idx].addLast(newNode);
    }

    public E2 get(E1 key){
        int idx = hashFunction(key);

        LinkedList<Node<E1, E2>> tmp = hashTable[idx];

        for(Node<E1, E2> node : tmp){
            if(node.getKey().equals(key)){
                return node.getContent();
            }
        }

        return null;
    }

}
