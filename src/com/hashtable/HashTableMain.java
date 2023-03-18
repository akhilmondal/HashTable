package com.hashtable;

public class HashTableMain {

    public static void main(String[] args) {

        System.out.println("Welcome to the HashTable Program. ");
        HashTable table = new HashTable(10);
        String sentence = "To be or not to be";
        String[] words = sentence.split(" ");
        for (String word : words) {
            table.put(word, 1);
        }
        int frequency = table.get("be");
        System.out.println("Frequency of 'be': " + frequency);
    }
}
