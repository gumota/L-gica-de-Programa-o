package estrutura_sequencial;

import java.util.Scanner;

public class Exercicio14 {

	private static Scanner in;

	public static void main(String[] args) {

		in = new Scanner(System.in);

		System.out.println("Digite o primeiro ângulo do triângulo: ");
		int ang1 = in.nextInt();
		System.out.println("Digite o segundo ângulo do triângulo: ");
		int ang2 = in.nextInt();

		int ang3 = 180 - (ang1 + ang2);

		System.out.println("O terceiro ângulo mede " + ang3 + " graus.");

	}

}
