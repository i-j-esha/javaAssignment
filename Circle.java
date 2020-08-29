package javaProject;

public class Circle implements Shape{
		private double radius;
		
		
		public Circle(double radius){
			this.radius = radius;
		}
		
		public void area(){
			double area = Math.PI* radius* radius;
			System.out.println("Area: "+area);
		}
		
		public void boundary_length(){
			double boundary_length = 2*Math.PI*radius;
			System.out.println("Boundary Length:"+boundary_length);
		}
}
