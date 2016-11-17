
//CS362 Jared Hughes Assignment 2 Warmup Tests
package edu.osu.cs362;

import static org.junit.Assert.*;
import org.junit.Test;


public class WarmupTest  {
    @Test
    public void testFindIntegerExample() {

		int result = WarmUp.findInteger(new int[] { 1, 2, 3, 4, 5 }, 100);
		assertEquals(result, -1);

		for (int i = 1; i < 5; i++) {
			int result2 = WarmUp.findInteger(new int[] { 1, 2, 3, 4, 5 }, i + 1);
			assertEquals("findInteger(new int[]{1,2,3,4,5}," + i + ")", result2, i);
		}
	}

    @Test
    public void testlastZero() {
	
		int findZero = WarmUp.lastZero(new int[] {1, 2, 3, 4, 5, 6, 7});
		assertEquals(-1, findZero); 
		
		int findZero3 = WarmUp.lastZero(new int[] {0, 1, 0, 3, 4});
		assertEquals(2, findZero3);
	
		int findZero4 = WarmUp.lastZero(new int[] {});
		assertEquals(-1, findZero4);
	
		//should return -1 as test would never actually run through loop
		int findZero5 = WarmUp.lastZero(new int[] {0});
		assertEquals(-1, findZero5);

		int findZero2 = WarmUp.lastZero(new int[] {0, 1, 2, 3, 4});
		assertEquals(0, findZero2);
}

    @Test
    public void testlast() {

		//test if the array is empty first, if null should return -1	
		int findLast = WarmUp.last(new int[] {}, 2);
		assertEquals(-1, findLast);	

		int findLast3 = WarmUp.last(new int[] {1}, 1);
		assertEquals(0, findLast3);

		for (int i = 1; i < 5; i++){
			int findLast2 = WarmUp.last(new int[] {1, 5, 4, 7, 3}, i);
			if (i == 1){
				assertEquals(0, findLast2);
			} 
			if (i == 2){
				assertEquals(-1, findLast2);
			}
			if (i == 3){
				assertEquals(4, findLast2);
			}
			if (i > 3){
				assertEquals(-1, findLast2);
			}
		}
	}

    //this test should be simple.  Test if the array is empty, other than that test to make sure it counts correct
    @Test
    public void testpositive() {
	
		int findPos = WarmUp.positive(new int[] {1, 0, 0, 1, 100});
		assertEquals(3, findPos);

		//test if empty array gives accurate 0 count or if it comes back null
		int findPos2 = WarmUp.positive(new int[] {});
		assertEquals(0, findPos2);

		//verify code works with negatives
		int findPos3 = WarmUp.positive(new int[] {-1,1});
		assertEquals(1, findPos3);
	}

    @Test
    public void testoddOrPos(){

		//empty array should come back as zero
		int findOddOrPos = WarmUp.oddOrPos(new int[] {});
		assertEquals(0, findOddOrPos);

		int findOddOrPos6 = WarmUp.oddOrPos(new int[] {-1});
		assertEquals(1, findOddOrPos6);

		//this should neither proc odd or positive, should come back zero
		int findOddOrPos2 = WarmUp.oddOrPos(new int[] {0});
		assertEquals(0, findOddOrPos2);

		//verify conditional procs for only one half of the conditions
		int findOddOrPos3 = WarmUp.oddOrPos(new int[] {1});
		assertEquals(1, findOddOrPos3);
		
		//should return a single count for 1 positive and 1 odd remainder
		int findOddOrPost5 = WarmUp.oddOrPos(new int[] {2, 1});
		assertEquals(2, findOddOrPost5);
	}
}



