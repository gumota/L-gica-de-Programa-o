package estrutura_sequencial;

import java.util.Scanner;

public class Exercicio03 {

	private static Scanner in;

	public static void main(String[] args) {

		in = new Scanner(System.in);

		System.out.println("Digite a medida da base do triângulo: ");
		double base = in.nextDouble();

		System.out.println("Digite a medida da altura do triângulo: ");
		double altura = in.nextDouble();

		System.out.println("A área do triângulo é " + (base * altura / 2));

	}

}
