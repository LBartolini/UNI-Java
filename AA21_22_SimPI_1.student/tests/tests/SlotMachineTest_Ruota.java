package tests;

//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertArrayEquals;

//import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

import javamm.SlotMachine;

public class SlotMachineTest_Ruota {

	@Test
	public void test1() {
		
		int[][] slot = new int[][] {{0,0,0,1},
									{0,1,1,0},
									{1,1,0,1} };
		int[] rotazioni = {2,2,0,1};
		int[][] slotRuotata = { {0,1,0,1},
								{1,1,1,1},
								{0,0,0,0} };;
		Assert.assertArrayEquals(SlotMachine.ruota (slot, rotazioni),slotRuotata);
	}
	
	@Test
	public void test2() {
		
		int[][] slot = new int[][] {{0,0,0,1},
									{0,1,1,0},
									{1,1,0,1} };
		int[] rotazioni = {5,8,6,10};
		int[][] slotRuotata = { {0,1,0,1},
								{1,1,1,1},
								{0,0,0,0} };
		Assert.assertArrayEquals(SlotMachine.ruota (slot, rotazioni),slotRuotata);
	}
	
	@Test
	public void test3() {
		
		int[][] slot = new int[][] {{1,0},
									{0,1},
									{1,1},
									{0,0},
									{0,1},
									{1,0},
									{1,1} };
		int[] rotazioni = {1,1};
		int[][] slotRuotata = {		{1,1},
									{1,0},
									{0,1},
									{1,1},
									{0,0},
									{0,1},
									{1,0} };
		Assert.assertArrayEquals(SlotMachine.ruota (slot, rotazioni),slotRuotata);
	}
	
	@Test
	public void test4() {
		
		int[][] slot = new int[][] {{1},
									{0},
									{1},
									{0},
									{0},
									{1},
									{1} };
		int[] rotazioni = {15};
		int[][] slotRuotata = {		{1},
									{1},
									{0},
									{1},
									{0},
									{0},
									{1} };
		Assert.assertArrayEquals(SlotMachine.ruota (slot, rotazioni),slotRuotata);
	}
	
	@Test
	public void test5() {
		
		int[][] slot = new int[][] {{0,0,0,1,0,0},
									{0,1,1,0,0,1},
									{1,1,0,1,0,1},
									{0,0,0,1,0,0},
									{0,0,0,0,1,0}};
		int[] rotazioni = {0,1,6,0,3,11};
		int[][] slotRuotata = { {0,0,0,1,0,0},
								{0,0,0,0,0,0},
								{1,1,1,1,1,1},
								{0,1,0,1,0,1},
								{0,0,0,0,0,0}};
		Assert.assertArrayEquals(SlotMachine.ruota (slot, rotazioni),slotRuotata);
	}
	
}
