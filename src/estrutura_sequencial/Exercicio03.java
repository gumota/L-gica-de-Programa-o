package estrutura_sequencial;

import java.util.Scanner;

public class Exercicio03 {

	private static Scanner in;

	public static void main(String[] args) {

		in = new Scanner(System.in);

		System.out.println("Digite a medida da base do tri�ngulo: ");
		double base = in.nextDouble();

		System.out.println("Digite a medida da altura do tri�ngulo: ");
		double altura = in.nextDouble();

		System.out.println("A �rea do tri�ngulo � " + (base * altura / 2));

	}

}
