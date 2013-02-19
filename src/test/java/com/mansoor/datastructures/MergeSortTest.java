package com.mansoor.datastructure;
import org.junit.Before;
import org.junit.Test;
import static org.fest.assertions.api.Assertions.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MergeSortTest{
	private MergeSort sort;
	private static final Logger logger=LoggerFactory.getLogger(MergeSortTest.class);

	@Before
	public void setup(){
		sort=new MergeSort();
	}

	@Test
	public void testSort(){
		int[] input=new int[]{1,3,6,4,8,12,5};
		sort.sort(input);
		for (int i : input) {
		 logger.info(String.valueOf(i));	
		}
		assertThat(input[2]).isEqualTo(4);
	
	}


}