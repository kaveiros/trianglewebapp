package com.keylane.triangle.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.keylane.components.Triangle;
import com.keylane.components.TriangleType;
import com.keylane.engine.KeylaneException;
import com.keylane.engine.TriangleService;

/**
 * Test class for the methods of TriangleService class
 * This is to ensure proper functionality of the methods.
 * Look at README.md for running these tests.
 * @author Nikolaos Chantzopoulos
 * version 0.1
 * @since 11-18-2017
 */
public class TriangleServiceTest {
	
	TriangleService service = new TriangleService();
	Triangle triangle = new Triangle();
	
	@Test
	public void testIsosceles() {
		triangle.setImageUrl("https://upload.wikimedia.org/wikipedia/commons/1/14/Triangle.Isosceles.svg");
		triangle.setType(TriangleType.ISOSCELES);
		Triangle triangleIsosc = service.defineTriangleType(8, 8, 3);
		assertEquals(triangle.getImageUrl(), triangleIsosc.getImageUrl());
	}

	@Test
	public void testScalene() {
		triangle.setType(TriangleType.SCALENE);
		triangle.setImageUrl("https://upload.wikimedia.org/wikipedia/commons/9/93/Triangle.Scalene.svg");
		Triangle triangleSc = service.defineTriangleType(5, 4, 2);
		assertEquals(triangle.getType(), triangleSc.getType());
	}
	
	@Test
	public void testEquilateral() {
		triangle.setImageUrl("https://upload.wikimedia.org/wikipedia/commons/9/96/Triangle.Equilateral.svg");
		triangle.setType(TriangleType.EQUILATERAL);
		Triangle triangleEq = service.defineTriangleType(5, 5, 5);
		assertEquals(triangle.getType(), triangleEq.getType());
	}
	
	@Test
	public void testValidTriangle() {
		
		try {
			assertTrue(service.determineIsValidTriangle(5, 4, 7));
		} catch (KeylaneException e) {
			e.getMessage();
		}
		
	}
	
	@Test(expected = KeylaneException.class)
	public void testValidTriangleException() throws KeylaneException {
		service.determineIsValidTriangle(50, 0, 1);
	}
	

}
