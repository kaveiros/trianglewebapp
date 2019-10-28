package com.keylane.components;

/**
 * Class to represent a triangle
 * @author Nikolaos Chantzopoulos
 * @version 0.1
 * @since 11-18-2017
 */
public class Triangle {
	
	private TriangleType type;
	
	private String imageUrl;
	
	private int side1;
	
	private int side2;
	
	private int side3;

	public Triangle(TriangleType type, String imageUrl) {
		this.type = type;
		this.imageUrl = imageUrl;
	}
	
	public Triangle() {
		
	}

	public TriangleType getType() {
		return type;
	}

	public void setType(TriangleType type) {
		this.type = type;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public int getSide1() {
		return side1;
	}

	public void setSide1(int side1) {
		this.side1 = side1;
	}

	public int getSide2() {
		return side2;
	}

	public void setSide2(int side2) {
		this.side2 = side2;
	}

	public int getSide3() {
		return side3;
	}

	public void setSide3(int side3) {
		this.side3 = side3;
	}

}
