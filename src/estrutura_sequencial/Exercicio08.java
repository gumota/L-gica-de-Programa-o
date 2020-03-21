package estrutura_sequencial;

import java.util.Scanner;

public class Exercicio08 {

	private static Scanner in;

	public static void main(String[] args) {

		in = new Scanner(System.in);

		System.out.println("Digite o valor depositado na poupança: ");
		double valor = in.nextDouble();
		double valorFinal = valor * 1.013;
		System.out.println("O valor final, já com o que rendeu, corresponde a R$ " + valorFinal);

	}

}
