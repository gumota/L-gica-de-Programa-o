package estrutura_de_decisao;

import java.util.Scanner;

public class Exercicio18 {

	private static Scanner in;

	public static void main(String[] args) {

		in = new Scanner(System.in);

		System.out.println("Digite um valor: ");
		int valor1 = in.nextInt();
		System.out.println("Digite outro valor: ");
		int valor2 = in.nextInt();

		if (valor1 >= valor2) {
			System.out.println("A diferença entre os valores, do maior para o menor, é " + (valor1 - valor2));

		} else {
			System.out.println("A diferença entre os valores, do maior para o menor, é " + (valor2 - valor1));
		}
	}

}
