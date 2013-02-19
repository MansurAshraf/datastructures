package com.mansoor.datastructures;

/**
 * @author Muhammad Ashraf
 * @since 2/19/13
 */
public class BinarySearchTree<K extends Comparable<K>, V> {

    private BSTNode<K, V> root;

    public V get(K key) {
        return get(root, key);
    }

    private V get(BSTNode<K, V> root, K key) {
        if (root == null) {
            return null;
        } else if (root.getKey().compareTo(key) == 0) {
            return root.getValue();
        } else if (root.getKey().compareTo(key) < 0) {
            return get(root.getRight(), key);
        } else {
            return get(root.getLeft(), key);
        }
    }

    public void put(K key, V value) {
        root = put(root, key, value);
    }

    private BSTNode<K, V> put(BSTNode<K, V> node, K key, V value) {
        if (node == null) {
            return new BSTNode<K, V>(key, value, 1);
        } else if (node.getKey().compareTo(key) < 0) {
            node.setRight(put(node.getRight(), key, value));
        } else {
            node.setLeft(put(node.getLeft(), key, value));
        }
        node.setNodes(size(node.getLeft()) + size(node.getRight()) + 1);

        return node;
    }

    private int size(BSTNode<K, V> node) {
        return node == null ? 0 : 1;
    }

}
