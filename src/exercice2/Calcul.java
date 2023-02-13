package exercice2;

import java.util.Scanner;

public class Calcul {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("entrer un premier nombre : ");
		Scanner sc = new Scanner(System.in);
		
		int nombre1 = sc.nextInt();
		
		System.out.print("entrer un deuxieme nombre : ");
		int nombre2 = sc.nextInt();
		
		System.out.print("entrer un troisieme nombre : ");
		int nombre3 = sc.nextInt();
		
		int somme = nombre1 + nombre2 + nombre3;
		
		System.out.println("la somme des trois nombres est : " + somme);
		
		
		int average = somme / 3 ;
		System.out.println("la moyenne des trois nombres est : " + average);
		
		int minNombre = Math.min(Math.min(nombre1, nombre2), nombre3);
		System.out.println("le minimum est : " + minNombre);
		
		int maxNombre = Math.max(Math.max(nombre1, nombre2), nombre3);
		System.out.println("le maximun est : " + maxNombre);
		

	}

}
