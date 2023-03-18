package com.hashtable;

public class HashTableMain {

    public static void main(String[] args) {

        System.out.println("Welcome to the HashTable Program. ");
        HashTable table = new HashTable(10);
        String paragraph = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
        String[] words = paragraph.split(" "); // Separating each and every word by space ( )
        for (String word : words) {
            table.put(word, 1);
        }
        table.remove("avoidable");
        int frequency = table.get("paranoid");
        System.out.println("Frequency of 'paranoid': " + frequency);
        System.out.println(paragraph);
    }
}
