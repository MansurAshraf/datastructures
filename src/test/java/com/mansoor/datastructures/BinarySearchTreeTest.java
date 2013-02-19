package com.mansoor.datastructures;

import org.junit.Before;
import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

/**
 * @author Muhammad Ashraf
 * @since 2/19/13
 */
public class BinarySearchTreeTest {
    private BinarySearchTree<Integer, String> tree;

    @Before
    public void setUp() throws Exception {
        tree = new BinarySearchTree<Integer, String>();
    }

    @Test
    public void testTree() throws Exception {
        tree.put(3, "Mansoor");
        tree.put(4, "Naima");
        tree.put(5, "Bilaal");
        tree.put(6, "Jibraan");
        tree.put(1, "Abbu");
        tree.put(2, "Amee");

        assertThat(tree.get(-1)).isNull();
        assertThat(tree.get(5)).isEqualTo("Bilaal");

    }
}
