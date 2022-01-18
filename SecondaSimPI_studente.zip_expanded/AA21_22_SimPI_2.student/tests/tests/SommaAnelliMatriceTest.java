package tests;

import org.junit.Assert;

import org.junit.Test;

import javamm.SommaAnelliMatrice;

public class SommaAnelliMatriceTest {
	
		@Test
		public void test1() {
			
			int[][] M = { {1,2,3,4,5},
			              {6,7,8,9,10},
			              {11,12,13,14,15},
			              {16,17,18,19,20},
			              {21,22,23,24,25}};

			int[] Ris = {208, 104, 13};
		
			Assert.assertArrayEquals(SommaAnelliMatrice.sommaAnelliMatrice(M), Ris);
		}
		
	 @Test
		public void test2() {
			
			int[][] M = { {1,0,0,0,1},
			              {0,1,0,1,0},
			              {0,0,1,0,0},
			              {0,1,0,1,0},
			              {1,0,0,0,1}};

			int[] Ris = {4, 4, 1};
		
			Assert.assertArrayEquals(SommaAnelliMatrice.sommaAnelliMatrice(M), Ris);
		}
	 
	 @Test
		public void test3() {
			
			int[][] M = { {1,0,0,0,1},
			              {1,1,0,1,1},
			              {0,0,1,0,0},
			              {0,1,0,1,0},
			              {1,0,0,0,1}};

			int[] Ris = {6, 4, 1};
		
			Assert.assertArrayEquals(SommaAnelliMatrice.sommaAnelliMatrice(M), Ris);
		}
	 
	 @Test
		public void test4() {
			
			int[][] M = { {-1,0,0,0,1},
			              {-1,1,2,-1,1},
			              {0,0,-5,0,0},
			              {0,1,2,1,0},
			              {1,0,0,0,1}};

			int[] Ris = {2, 6, -5};
		
			Assert.assertArrayEquals(SommaAnelliMatrice.sommaAnelliMatrice(M), Ris);
		}
	 
	 @Test
		public void test5() {
			
			int[][] M = { {-1,-1,-1},
			              {1,0,-1},
			              {1,1,1}};

			int[] Ris = {0, 0};
		
			Assert.assertArrayEquals(SommaAnelliMatrice.sommaAnelliMatrice(M), Ris);
		}

	 @Test
		public void test6() {
			
			int[][] M = { {-22} };

			int[] Ris = {-22};
		
			Assert.assertArrayEquals(SommaAnelliMatrice.sommaAnelliMatrice(M), Ris);
		}

	 @Test
		public void test7() {
			
			int[][] M = { {1,0,0,0,1,0,1},
			              {1,1,0,1,1,0,0},
			              {0,0,1,0,0,0,0},
			              {0,1,0,1,0,0,0},
			              {1,0,0,0,1,0,1},
			              {1,0,0,0,1,0,1},
			              {1,0,0,0,1,0,1}};

			int[] Ris = {11, 5, 2, 1};
		
			Assert.assertArrayEquals(SommaAnelliMatrice.sommaAnelliMatrice(M), Ris);
		}
	 
	 @Test
		public void test8() {
			
			int[][] M = { {1,0,0,0,7,0,1,1,1},
			              {1,1,0,1,7,0,0,1,1},
			              {0,0,1,0,0,0,0,1,1},
			              {0,1,0,1,0,0,0,0,0},
			              {1,0,0,0,9,0,1,0,0},
			              {1,0,0,4,1,0,1,0,0},
			              {1,0,0,0,1,0,1,0,0},
			              {1,0,0,0,1,0,1,0,0},
			              {1,0,0,0,1,0,1,0,0}};

			int[] Ris = {21, 14, 5, 6, 9};
		
			Assert.assertArrayEquals(SommaAnelliMatrice.sommaAnelliMatrice(M), Ris);
		}

	 @Test
		public void test9() {
			
			int[][] M = { 	{1,0,0,2,-1},
							{0,1,1,1,-9},
							{0,0,3,5,0},
							{1,0,0,0,0},
							{2,0,0,1,1}};

			int[] Ris = {-2,8,3};
		
			Assert.assertArrayEquals(SommaAnelliMatrice.sommaAnelliMatrice(M), Ris);
		}

	 

		
}