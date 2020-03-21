package estrutura_sequencial;

import java.util.Scanner;

public class Exercicio17 {

	private static Scanner in;

	public static void main(String[] args) {

		in = new Scanner(System.in);

		System.out.println("Digite o tempo gasto na viagem em horas: ");
		double tempo = in.nextDouble();

		System.out.println("Digite a velocidade média em km/hr: ");
		double velocidade = in.nextDouble();

		double litros = ((tempo * velocidade) / 12);
		System.out.println("Foi gasto " + litros + " litros de gasolina na viagem.");

	}

}
