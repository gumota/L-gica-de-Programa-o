package estrutura_sequencial;

import java.util.Scanner;

public class Exercicio09 {

	private static Scanner in;

	public static void main(String[] args) {

		in = new Scanner(System.in);

		System.out.println("Digite um n�mero inteiro: ");
		int x = in.nextInt();
		System.out.println("Digite um outro n�mero inteiro: ");
		int y = in.nextInt();

		int total = ((x * x) + (y * y));

		System.out.println("O valor da soma dos seus quadrados � " + total);

	}

}
