package estrutura_de_decisao;

import java.util.Scanner;

public class Exercicio24 {

	private static Scanner in;

	public static void main(String[] args) {

		in = new Scanner(System.in);

		System.out.println("Digite um valor: ");
		int x = in.nextInt();

		if (x % 2 == 0 && x % 3 == 0) {
			System.out.println(x + " é divisível por 2 e 3");

		} else {
			System.out.println("Não é divisível por 2 e 3");

		}

	}

}
