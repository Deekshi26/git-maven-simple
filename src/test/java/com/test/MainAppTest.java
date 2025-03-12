package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.MainApp;

public class MainAppTest {
	
	@Test
	public void testPositive() {
		MainApp m = new MainApp();
		assertEquals(8,m.addition(4, 4));
	}
	
	@Test
	public void testMultiply() {
		MainApp m = new MainApp();
		assertEquals(16,m.multiply(4, 4));
	}

}
