package estrutura_sequencial;

import java.util.Scanner;

public class Exercicio16 {

	private static Scanner in;

	public static void main(String[] args) {

		in = new Scanner(System.in);

		System.out.println("Digite a quantidade de horas: ");
		double quantidadeHoras = in.nextDouble();

		System.out.println("Digite o valor da hora: ");
		double valorHora = in.nextDouble();

		System.out.println("Digite o percentual de desconto: ");
		double percDesc = in.nextDouble();

		System.out.println("Digite a quantidade de dependentes: ");
		double quantidadeDep = in.nextDouble();

		double salario = (quantidadeHoras * valorHora);
		double salarioLiquido = salario - (salario * (percDesc / 100));
		salarioLiquido = salarioLiquido + (quantidadeDep * 100);

		System.out.println("O seu salário líquido é " + salarioLiquido);

	}

}
