package estrutura_de_decisao;

import java.util.Scanner;

public class Exercicio21 {

	private static Scanner in;

	public static void main(String[] args) {

		in = new Scanner(System.in);
		int[] vet = new int[4];
		double media = 0;

		System.out.println("Digite as 4 notas do aluno e ontenha sua média e seu status");

		for (int i = 0; i < 4; i++) {
			vet[i] = in.nextInt();
			media += vet[i];
		}

		media = (media / 4);

		if (media >= 6) {
			System.out.println("Média = " + media + " . Status: APROVADO");
		} else if (media >= 4 && media < 6) {
			System.out.println("Média = " + media + " . Status: EXAME");
		} else {
			System.out.println("Média = " + media + " . Status: REPROVADO");
		}

	}

}
