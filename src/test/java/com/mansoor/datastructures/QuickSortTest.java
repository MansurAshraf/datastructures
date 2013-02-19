package com.mansoor.datastructures;

import org.junit.Before;
import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

/**
 * @author Muhammad Ashraf
 * @since 2/19/13
 */
public class QuickSortTest {

    private QuickSort sort;

    @Before
    public void setUp() throws Exception {
        sort = new QuickSort();
    }

    @Test
    public void testSort() throws Exception {
        int[] input = new int[]{1, 3, 6, 4, 8, 12, 5};
        sort.sort(input);
        assertThat(input[2]).isEqualTo(4);

    }
}
