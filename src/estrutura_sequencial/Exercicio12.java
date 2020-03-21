package estrutura_sequencial;

import java.util.Scanner;

public class Exercicio12 {

	private static Scanner in;

	public static void main(String[] args) {

		in = new Scanner(System.in);

		System.out.println("Digite o ano de nascimento: ");
		int anoNasc = in.nextInt();
		System.out.println("Digite o ano atual: ");
		int anoAtual = in.nextInt();

		int idade = anoAtual - anoNasc;
		int idadeFutura = idade + 17;

		System.out.println("Você tem " + idade + " anos de idade e daqui 17 anos terá " + idadeFutura + ".");

	}

}
