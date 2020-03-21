package estrutura_sequencial;

import java.util.Scanner;

public class Exercicio07 {

	private static Scanner in;

	public static void main(String[] args) {

		in = new Scanner(System.in);

		System.out.println("Digite a altura do paralelepipedo: ");
		double altura = in.nextDouble();
		System.out.println("Digite a largura do paralelepipedo: ");
		double largura = in.nextDouble();
		System.out.println("Digite o comprimento do paralelepipedo: ");
		double comprimento = in.nextDouble();

		double volume = altura * largura * comprimento;

		System.out.println("O volume total é " + volume);
	}

}
