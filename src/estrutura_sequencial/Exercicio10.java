package estrutura_sequencial;

import java.util.Scanner;

public class Exercicio10 {

	private static Scanner in;

	public static void main(String[] args) {

		in = new Scanner(System.in);

		System.out.println("Digite um n�mero: ");
		int x = in.nextInt();
		System.out.println("Digite outro n�mero: ");
		int y = in.nextInt();

		int diferenca = x - y;
		System.out.println("A diferen�a entre eles � " + diferenca);
	}

}
