package tests;

import org.junit.Assert;

import org.junit.Test;

import javamm.ArrayCircolare;

public class ArrayCircolareTest {


		@Test
		public void test1() {
			
			int[] A = {2,4,2,-2,-1,2,-6,-1};
			boolean ris = true;
			Assert.assertEquals(ArrayCircolare.arrayCircolare(A), ris);
		}
		
		@Test
		public void test2() {
			
			int[] A = {2,4,2,-2,-15,2,-6,-1};
			boolean ris = false;
			Assert.assertEquals(ArrayCircolare.arrayCircolare(A), ris);
		}
		
		@Test
		public void test3() {
			
			int[] A = {2,4,2,-2,-1,2,1,-1};
			boolean ris = false;
			Assert.assertEquals(ArrayCircolare.arrayCircolare(A), ris);
		}
		
		@Test
		public void test4() {
			
			int[] A = {2,4,-2,-2,-1,2,-6,-1};
			boolean ris = false;
			Assert.assertEquals(ArrayCircolare.arrayCircolare(A), ris);
		}
		
		@Test
		public void test5() {
			
			int[] A = {2,4,2,12,-1,2,-6,-1};
			boolean ris = false;
			Assert.assertEquals(ArrayCircolare.arrayCircolare(A), ris);
		}
		
		@Test
		public void test6() {
			
			int[] A = {-2,4,2,-2,-1,2,-6,-1};
			boolean ris = false;
			Assert.assertEquals(ArrayCircolare.arrayCircolare(A), ris);
		}
		
		@Test
		public void test7() {
			
			int[] A = {1,-1};
			boolean ris = true;
			Assert.assertEquals(ArrayCircolare.arrayCircolare(A), ris);
		}
		
		@Test
		public void test8() {
			
			int[] A = {1,1};
			boolean ris = false;
			Assert.assertEquals(ArrayCircolare.arrayCircolare(A), ris);
		}
		
		@Test
		public void test9() {
			
			int[] A = {1};
			boolean ris = false;
			Assert.assertEquals(ArrayCircolare.arrayCircolare(A), ris);
		}
		
		@Test
		public void test10() {
			
			int[] A = {-1};
			boolean ris = false;
			Assert.assertEquals(ArrayCircolare.arrayCircolare(A), ris);
		}
		
		@Test
		public void test11() {
			
			int[] A = {7,5,3,1,-4,-2,-4,-6};
			boolean ris = true;
			Assert.assertEquals(ArrayCircolare.arrayCircolare(A), ris);
		}
	}