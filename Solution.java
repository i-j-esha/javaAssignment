package javaProject;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		
		System.out.println("choice 1 for Circle");
		System.out.println("choice 2 for Triangle");
		System.out.println("choice 3 for Square");
		
		Scanner sc=new Scanner(System.in);
		
		int choice=sc.nextInt();
		
		if (choice==1) {
			
			Circle c1=new Circle(30);
			c1.area();
			c1.boundary_length();
		}
		
		if (choice==2) {
			
			Triangle t1=new Triangle(20,30);
			t1.area();
			t1.boundary_length();
		}
		if (choice==3){
			
			Square s1=new Square(40);
			s1.area();
			s1.boundary_length();
		}
		
	}

}
