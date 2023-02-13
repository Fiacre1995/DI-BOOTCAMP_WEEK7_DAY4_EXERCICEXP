package exercice1;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("entrer un rayon : ");
		Scanner sc = new Scanner(System.in);
		double radius = sc.nextDouble();
		
		
			double perimetre = radius * radius;
			System.out.print("le perimetre du cercle est : " + perimetre + "\n");
			
			double aire = Math.PI * Math.pow(radius, 2);
			System.out.print("l'aire du cercle est : " + aire);
			
		
		

	}

}
