package com.hashtable;

import java.util.LinkedList;

public class HashTable {

    private LinkedList<MyMapNode>[] table;
    private int size;

    public HashTable(int size) {
        this.size = size;
        table = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            table[i] = new LinkedList<MyMapNode>();
        }
    }

    private int getHash(String key) {
        int hash = key.hashCode() % size;
        if (hash < 0) {
            hash += size;
        }
        return hash;
    }

    public void put(String key, int value) {
        int hash = getHash(key);
        LinkedList<MyMapNode> list = table[hash];
        for (MyMapNode node : list) {
            if (node.getKey().equals(key)) {
                node.setValue(node.getValue() + value);
                return;
            }
        }
        list.add(new MyMapNode(key, value));
    }

    public int get(String key) {
        int hash = getHash(key);
        LinkedList<MyMapNode> list = table[hash];
        for (MyMapNode node : list) {
            if (node.getKey().equals(key)) {
                return node.getValue();
            }
        }
        return 0;
    }
}

