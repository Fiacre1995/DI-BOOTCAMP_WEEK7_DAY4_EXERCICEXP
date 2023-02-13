package exercice3;

import java.util.Random;
import java.util.Scanner;

public class NumberGenerators {

	public static void randomNumber() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Entrer la valeur de X : ");
		int numberX = sc.nextInt();

		System.out.print("Entrer la valeur de N : ");
		int numberN = sc.nextInt();

		Random random = new Random();

		for (int compteur = 0; compteur < numberN; compteur++) {
			System.out.println(random.nextInt(1, numberX + 1));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NumberGenerators nombreAleatoire = new NumberGenerators();
		nombreAleatoire.randomNumber();
		

	}

}
