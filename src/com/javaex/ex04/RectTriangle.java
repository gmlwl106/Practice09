package com.javaex.ex04;

public class RectTriangle extends Shape {

	//필드
	private double width;
	private double height;
	
	
	
	
	//생성자
	public RectTriangle() {
	}
	public RectTriangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	
	//메소드 gs
	public double getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	
	
	//메소드 일반
	@Override
	public double getArea() {
		return width * height * 0.5;
	}
	@Override
	public double getPerimeter() {
		return width + height + Math.sqrt((width*width)+(height*height));
	}
	

}