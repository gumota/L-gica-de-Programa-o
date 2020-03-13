package estrutura_de_decisao;

import java.util.Scanner;

public class Exercicio23 {

	private static Scanner in;

	public static void main(String[] args) {

		in = new Scanner(System.in);

		System.out.println("A seguir digite um série de 3 números em ordem crescente e outro aleatório: ");
		int valor1 = in.nextInt();
		int valor2 = in.nextInt();
		int valor3 = in.nextInt();
		int valor4 = in.nextInt();

		if (valor4 <= valor1) {
			System.out.println(valor4);
			System.out.println(valor1);
			System.out.println(valor2);
			System.out.println(valor3);

		} else if (valor4 <= valor2) {
			System.out.println(valor1);
			System.out.println(valor4);
			System.out.println(valor2);
			System.out.println(valor3);

		} else if (valor4 <= valor3) {
			System.out.println(valor1);
			System.out.println(valor2);
			System.out.println(valor4);
			System.out.println(valor3);

		} else if (valor4 > valor3) {

			System.out.println(valor1);
			System.out.println(valor2);
			System.out.println(valor3);
			System.out.println(valor4);

		}

	}

}
