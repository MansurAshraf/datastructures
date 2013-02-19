package com.mansoor.datastructures;

/**
 * @author Muhammad Ashraf
 * @since 2/19/13
 */
public class BSTNode<K,V> {
    private K key;
    private V value;
    private int nodes;
    private BSTNode<K,V> left;
    private BSTNode<K,V> right;

    public BSTNode(K key, V value, int nodes) {
        this.key = key;
        this.value = value;
        this.nodes = nodes;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public int getNodes() {
        return nodes;
    }

    public void setNodes(int nodes) {
        this.nodes = nodes;
    }

    public BSTNode<K, V> getLeft() {
        return left;
    }

    public void setLeft(BSTNode<K, V> left) {
        this.left = left;
    }

    public BSTNode<K, V> getRight() {
        return right;
    }

    public void setRight(BSTNode<K, V> right) {
        this.right = right;
    }
}
