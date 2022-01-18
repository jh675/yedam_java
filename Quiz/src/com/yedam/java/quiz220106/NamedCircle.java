package com.yedam.java.quiz220106;

public class NamedCircle {
	private int radius;
	private String name;
	
	public NamedCircle(int radius, String name) {
		this.radius = radius;
		this.name = name;
	}
	
	public int getRadius() {
		return radius;
	}
	public String getName() {
		return name;
	}
	
	void show() {
		System.out.println(name + ", 반지름= " + radius);
	}
}
