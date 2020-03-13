package estrutura_de_decisao;

import java.util.Scanner;

public class Exercicio22 {

	private static Scanner in;

	public static void main(String[] args) {

		in = new Scanner(System.in);

		System.out.println("Digite dois valores inteiros e diferentes: ");
		int valor1 = in.nextInt();
		int valor2 = in.nextInt();

		if (valor1 != valor2) {
			if (valor1 > valor2) {
				System.out.println(valor2 + "\n" + valor1);
			} else {
				System.out.println(valor1 + "\n" + valor2);
			}

		} else {
			System.out.println("Os valores digitados são iguais.");
		}
	}

}
