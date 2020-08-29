package javaProject;

public class Triangle implements Shape{
	
	private double base;
	private double height;
	
	public Triangle(double base, double height){
		this.base = base;
		this.height = height;
	}
	
	public void area(){
		double area = base * height /2;
		System.out.println("Area:"+area);
	}
	
	public void boundary_length(){
		double boundary_length = (2*base)+ Math.sqrt(2*base*height);
		System.out.println("Boundary Length: "+ boundary_length);
	}
}