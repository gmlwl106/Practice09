package com.javaex.ex04;

public class Rectangle extends Shape implements Resizeable {
    
	//필드
	private double width;
	private double height;
	

	
	//생성자
	public Rectangle() {
	}
	public Rectangle(int width, int height) {
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
		return width*height;
	}
	
	@Override
	public double getPerimeter() {
		return (width+height)*2;
	}
	
	@Override
	public void resize(double s) {
		this.width = width * s;
		this.height = height * s;
	}
	
	

}