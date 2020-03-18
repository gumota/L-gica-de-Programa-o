package estrutura_sequencial;

import java.util.Scanner;

public class Exercicio04 {

	private static Scanner in;

	public static void main(String[] args) {

		in = new Scanner(System.in);
		int celsius;

		System.out.println("Digite a temperatura em graus Celsius e obtenha em fahrenheit");
		celsius = in.nextInt();

		double fahrenheit = ((9 * celsius) + 160) / 5;

		System.out.println(fahrenheit);

	}

}
