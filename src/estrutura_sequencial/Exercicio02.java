package estrutura_sequencial;

import java.util.Scanner;

public class Exercicio02 {

	private static Scanner in;

	public static void main(String[] args) {

		in = new Scanner(System.in);
		double salario;

		System.out.println("Digite seu sal�rio:");
		salario = in.nextDouble();
		System.out.println("Seu novo sal�rio � R$ " + salario * 1.15);

	}

}
