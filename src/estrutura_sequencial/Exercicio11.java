package estrutura_sequencial;

import java.util.Scanner;

public class Exercicio11 {
	private static Scanner in;

	public static void main(String[] args) {

		in = new Scanner(System.in);

		System.out.println("Digite o raio da circunferência: ");
		int raio = in.nextInt();

		double comprimento = 2 * Math.PI * raio;

		System.out.println("O comprimento do raio é " + comprimento);

	}

}
