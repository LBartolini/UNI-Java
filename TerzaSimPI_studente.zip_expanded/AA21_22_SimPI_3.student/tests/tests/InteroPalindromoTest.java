package tests;

import org.junit.Assert;

import org.junit.Test;

import javamm.InteroPalindromo;

public class InteroPalindromoTest {


		@Test
		public void test1() {
			
			int n = 999999;
			boolean ris = true;
			Assert.assertEquals(InteroPalindromo.interoPalindromo(n), ris);
		}
		
		@Test
		public void test2() {
			
			int n = 989989;
			boolean ris = true;
			Assert.assertEquals(InteroPalindromo.interoPalindromo(n), ris);
		}

		@Test
		public void test3() {
			
			int n = 999399;
			boolean ris = false;
			Assert.assertEquals(InteroPalindromo.interoPalindromo(n), ris);
		}
	
		@Test
		public void test4() {
			
			int n = 91919;
			boolean ris = true;
			Assert.assertEquals(InteroPalindromo.interoPalindromo(n), ris);
		}
		
		@Test
		public void test5() {
			
			int n = 32992;
			boolean ris = false;
			Assert.assertEquals(InteroPalindromo.interoPalindromo(n), ris);
		}
		
		@Test
		public void test6() {
			
			int n = 1001;
			boolean ris = true;
			Assert.assertEquals(InteroPalindromo.interoPalindromo(n), ris);
		}
		
		@Test
		public void test7() {
			
			int n = 1000;
			boolean ris = false;
			Assert.assertEquals(InteroPalindromo.interoPalindromo(n), ris);
		}
		
		@Test
		public void test8() {
			
			int n = 505;
			boolean ris = true;
			Assert.assertEquals(InteroPalindromo.interoPalindromo(n), ris);
		}
		
		@Test
		public void test9() {
			
			int n = 550;
			boolean ris = false;
			Assert.assertEquals(InteroPalindromo.interoPalindromo(n), ris);
		}
		
		@Test
		public void test10() {
			
			int n = 77;
			boolean ris = true;
			Assert.assertEquals(InteroPalindromo.interoPalindromo(n), ris);
		}
		
		@Test
		public void test11() {
			
			int n = 50;
			boolean ris = false;
			Assert.assertEquals(InteroPalindromo.interoPalindromo(n), ris);
		}
		
		@Test
		public void test12() {
			
			int n = 3;
			boolean ris = true;
			Assert.assertEquals(InteroPalindromo.interoPalindromo(n), ris);
		}
	}