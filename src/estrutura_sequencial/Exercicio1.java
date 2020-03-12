package estrutura_sequencial;

import java.util.Scanner;

public class Exercicio1 {

	private static Scanner in;

	public static void main(String[] args) {

		in = new Scanner(System.in);
		double lado;

		System.out.println("Digite a medida de um lado do quadrado e obtenha sua área total");
		lado = in.nextDouble();

		System.out.println("A área do quadrado é " + lado * lado);

	}

}
