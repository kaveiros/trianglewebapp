package com.keylane.engine;

import com.keylane.engine.KeylaneException;

import com.keylane.components.Triangle;
import com.keylane.components.TriangleType;

/**
 * Service class containing all available methods
 * required for determining the triangle type.
 * @author Nikolaos Chantzopoulos
 * @version 0.1
 * @since 11-18-2017
 *
 */
public class TriangleService {
	
	private static final String ISOSCELES_URL = "https://upload.wikimedia.org/wikipedia/commons/1/14/Triangle.Isosceles.svg";
	private static final String SCALENE_URL = "https://upload.wikimedia.org/wikipedia/commons/9/93/Triangle.Scalene.svg";
	private static final String EQUILATERAL_URL = "https://upload.wikimedia.org/wikipedia/commons/9/96/Triangle.Equilateral.svg";
	
	/**
	 * Method that checks if the given lengths form a vaild triangle.
	 * @param side1 Length of side1
	 * @param side2 Length of side2
	 * @param side3 Length of side3
	 * @return boolean isValid
	 * @throws KeylaneException
	 */
	public boolean determineIsValidTriangle(int side1, int side2, int side3) throws KeylaneException{
		
		boolean isTriangle = false;
		
		if (side1 == 0 || side2 == 0 || side3 == 0) {
			throw new KeylaneException();
		}		
		else if (side1 + side2 > side3 
			&& side2 + side3 > side1 
			&& side1 + side3 > side2) {
			
			isTriangle = true;
		}
		
		return isTriangle;
		
	}
	
	/**
	 * Method that determines the triangle type.
	 * @param side1 Length of side1
	 * @param side2 Length of side2
	 * @param side3 Length of side3
	 * @return a Triangle object.
	 */
	public Triangle defineTriangleType(int side1, int side2, int side3)  {
		
		Triangle triangle = null;
		
		
		if ((side1 == side2) && (side1 != side3) ||
			(side1 == side3) && (side1 != side2) ||
			(side2 == side3) && (side2 != side1)) {
			
			triangle = new Triangle(TriangleType.ISOSCELES, ISOSCELES_URL);
			
		}
		else if ((side1 != side2) && (side2 != side3) && (side1 != side3)) {
			
			triangle = new Triangle(TriangleType.SCALENE, SCALENE_URL);
			
		}
		else if ((side1 == side2) && (side1 == side3)) {
			
			triangle = new Triangle(TriangleType.EQUILATERAL, EQUILATERAL_URL);
		}
		
		
		return triangle;
		
	}

}
