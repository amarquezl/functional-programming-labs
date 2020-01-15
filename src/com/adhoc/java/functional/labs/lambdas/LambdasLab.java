package com.adhoc.java.functional.labs.lambdas;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LambdasLab {
	
	public static List<Integer> filterNumbers(int[] array, Searchable obj) {
		List<Integer> result = new ArrayList<>();
		for(int val:array) {
			//if(val%2==1) {
			if(obj.test(val)) {	
				result.add(val);
			}
		}
		return result;
	}
	

	@Test
	public static void filterOddNumbersTest() {
		List<Integer> result = filterNumbers(new int[]{1,1,2,3,5,8,13,21}, (c) -> c%2==1);
		System.out.println(result);
		Assertions.assertEquals(6, result.size());
	}
	
	//TODO: rewrite filterOddNumbers to apply Strategy and accept a lambda
	//TODO: rewrite filterOddNumbersTest to use the lambda version of filterOddNumbers
	//TODO: rename filterOddNumbers to generalize its functionality, name it "filterNumbers"
	
	
	//TODO: complete this test to filter even numbers
	@Test
	public static void filterEvenNumbersTest() {
		List<Integer> result = filterNumbers(new int[]{1,1,2,3,5,8,13,21}, (c) -> c%2==0);
		System.out.println(result);
		Assertions.assertEquals(2, result.size());
	}
	
	public static void main(String[] args)
	{
		System.out.println("Testing");
		filterOddNumbersTest();
		filterEvenNumbersTest();
	}

}

interface Searchable {
	boolean test(int c);
}