package application;

import java.util.Scanner;

import entities.Rectangle;

public class Program {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle() ;
		
		System.out.println("Enter rectangle width and height: ");
		System.out.println("Width: ");
		rectangle.Width=sc.nextDouble();
		
		System.out.println("Height: ");
		rectangle.Height=sc.nextDouble();
		
		System.out.println(rectangle);
		
		sc.close();
	}
}