package tests;

import org.junit.Assert;

import org.junit.Test;

import javamm.RimuoviFibonacci;

public class RimuoviFibonacciTest {

	@Test
	public void test1() {
		
		int[] V = {-1,0,3,2,1,3,4,8,6,8,14,-1,1,0,11,-1,2};
		int[] ris = {-1, 0, 3, 8, 11, -1, 2};
		Assert.assertArrayEquals(RimuoviFibonacci.rimuoviFibonacci(V), ris);
	}
	
	@Test
	public void test2() {
		
		int[] V = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55};
		int[] ris = {};
		Assert.assertArrayEquals(RimuoviFibonacci.rimuoviFibonacci(V), ris);
	}
	
	@Test
	public void test3() {
		
		int[] V = {0, 0, 0, 0, 0 };
		int[] ris = {};
		Assert.assertArrayEquals(RimuoviFibonacci.rimuoviFibonacci(V), ris);
	}
	
	@Test
	public void test4() {
		
		int[] V = { -1, 1, 1, -1  };
		int[] ris = {-1, 1, 1, -1 };
		Assert.assertArrayEquals(RimuoviFibonacci.rimuoviFibonacci(V), ris);
	}
	
	@Test
	public void test5() {
		
		int[] V = { 1, 2, 3, 4  };
		int[] ris = {4};
		Assert.assertArrayEquals(RimuoviFibonacci.rimuoviFibonacci(V), ris);
	}
	
	@Test
	public void test6() {
		
		int[] V = { -5, 1, 2, 3, 4, -5  };
		int[] ris = {-5, 4, -5 };
		Assert.assertArrayEquals(RimuoviFibonacci.rimuoviFibonacci(V), ris);
	}

	@Test
	public void test7() {
		
		int[] V = {-1,0,-1 };
		int[] ris = {};
		Assert.assertArrayEquals(RimuoviFibonacci.rimuoviFibonacci(V), ris);
	}
	
	@Test
	public void test8() {
		
		int[] V = {1,1,1};
		int[] ris = {1,1,1};
		Assert.assertArrayEquals(RimuoviFibonacci.rimuoviFibonacci(V), ris);
	}
	
	}