package com.example.maven_github_demo;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class Hoshi1 {
@Test
	void testTotal() {
		assertEquals(225, Hoshi.calculateTotal(75, 68, 82));
	}
@Test
	void testAverage() {
		assertEquals(75.0,Hoshi.calculateAverage(75, 68, 82));
	}
@Test
	void testPass() {
		assertTrue(Hoshi.isPass(75.0));
	}
@Test
	void testFail() {
		assertFalse(Hoshi.isPass(35.0));
	}
}