package estrutura_sequencial;

import java.util.Scanner;

public class Exercicio13 {

	private static Scanner in;

	public static void main(String[] args) {

		in = new Scanner(System.in);

		System.out.println("Digite a quantidade de alimentos em kilogramas: ");
		int kg = in.nextInt();

		int duracao = (kg * 1000) / 50;

		System.out.println("Essa quantidade de alimento durará " + duracao + " dias.");

	}

}
