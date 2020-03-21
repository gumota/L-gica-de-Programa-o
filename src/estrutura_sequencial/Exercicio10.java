package estrutura_sequencial;

import java.util.Scanner;

public class Exercicio10 {

	private static Scanner in;

	public static void main(String[] args) {

		in = new Scanner(System.in);

		System.out.println("Digite um número: ");
		int x = in.nextInt();
		System.out.println("Digite outro número: ");
		int y = in.nextInt();

		int diferenca = x - y;
		System.out.println("A diferença entre eles é " + diferenca);
	}

}
