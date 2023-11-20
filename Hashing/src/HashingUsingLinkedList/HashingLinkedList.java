package HashingUsingLinkedList;

import java.util.LinkedList;
//some changes
class HashTable {
    private static final int TABLE_SIZE = 10;
    private LinkedList<Node>[] table;

    public HashTable() {
        table = new LinkedList[TABLE_SIZE];
        for (int i = 0; i < TABLE_SIZE; i++) {
            table[i] = new LinkedList<>();
        }
    }
    private static class Node {
        int key;
        String value;

        public Node(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }
    private int hashFunction(int key) {
        return key % TABLE_SIZE;
    }
    public void put(int key, String value) {
        int index = hashFunction(key);
        LinkedList<Node> list = table[index];
        for (Node node : list) {
            if (node.key == key) {
                node.value = value;
                return;
            }
        }
        list.add(new Node(key, value));
    }
    public String get(int key) {
        int index = hashFunction(key);
        LinkedList<Node> list = table[index];
        for (Node node : list) {
            if (node.key == key) {
                return node.value;
            }
        }
        return null;
    }
}

public class HashingLinkedList {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable();
        hashTable.put(1, "One");
        hashTable.put(2, "Two");
        hashTable.put(11, "Eleven");
        System.out.println("Value for key 1: " + hashTable.get(1));
        System.out.println("Value for key 2: " + hashTable.get(2));
        System.out.println("Value for key 11: " + hashTable.get(11));
    }
}
