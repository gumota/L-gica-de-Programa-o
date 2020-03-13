package estrutura_de_decisao;

import java.util.Scanner;

public class Exercicio20 {

	private static Scanner in;

	public static void main(String[] args) {

		in = new Scanner(System.in);

		System.out.println("Digite as 4 notas do aluno e ontenha sua média e seu status");

		int n1 = in.nextInt();
		int n2 = in.nextInt();
		int n3 = in.nextInt();
		int n4 = in.nextInt();

		double media = ((n1 + n2 + n3 + n4) / 4);

		if (media >= 6) {
			System.out.println("Média = " + media + " . Status: APROVADO");
		} else if (media >= 4 && media < 6) {
			System.out.println("Média = " + media + " . Status: EXAME");
		} else { 
			System.out.println("Média = " + media + " . Status: REPROVADO");
		}

	}

}
