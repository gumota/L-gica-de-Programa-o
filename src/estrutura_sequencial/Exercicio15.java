package estrutura_sequencial;

import java.util.Scanner;

public class Exercicio15 {

	private static Scanner in;

	public static void main(String[] args) {

		in = new Scanner(System.in);

		System.out.println("Digite o cateto do triângulo: ");
		int cat1 = in.nextInt();
		System.out.println("Digite o outro cateto do triângulo: ");
		int cat2 = in.nextInt();

		double hip = Math.sqrt((cat1 * cat1) + (cat2 * cat2));

		System.out.println("A hipotenusa vale " + hip);

	}

}
