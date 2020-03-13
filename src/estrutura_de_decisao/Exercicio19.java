package estrutura_de_decisao;

import java.util.Scanner;

public class Exercicio19 {

	private static Scanner in;

	public static void main(String[] args) {

		in = new Scanner(System.in);

		System.out.println("Digite dois valores e obtenha o maior deles");
		int x = in.nextInt();
		int y = in.nextInt();

		if (x >= y) {
			System.out.println(x);
		} else {
			System.out.println(y);
		}

	}

}
