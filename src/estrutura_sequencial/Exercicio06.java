package estrutura_sequencial;

import java.util.Scanner;

public class Exercicio06 {

	private static Scanner in;

	public static void main(String[] args) {

		in = new Scanner(System.in);

		int aux = 0;

		System.out.println("Dgite o valor de x: ");
		int x = in.nextInt();
		System.out.println("Digite o valor de y: ");
		int y = in.nextInt();

		aux = x;
		x = y;
		y = aux;

		System.out.println("x está valendo " + x);
		System.out.println("y está valendo " + y);

	}

}
