package javaProject;

public class Square implements Shape{
	
	public double length;
	
	public Square(double length){
		this.length = length;
	}
	
	public void area(){
		double area = length*length;
		System.out.println("Area: "+area);
	}
	
	public void boundary_length(){
		double boundary_length = 4*length;
		System.out.println("Boundary Length: "+boundary_length);
	}
}
