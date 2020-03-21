package estrutura_sequencial;

import java.util.Scanner;

public class Exercicio05 {

private static Scanner in;

public static void main(String[] args) {
		
		in = new Scanner(System.in);
		
		System.out.println("Digite o A da equação do segundo grau: ");
		int a = in.nextInt();
		System.out.println("Digite o B da equação do segundo grau: ");
		int b = in.nextInt();
		System.out.println("Digite o C da equação do segundo grau: ");
		int c = in.nextInt();
		
		int delta = (b * b) - 4 * a * c;
		

		double x1 = (((-b) + Math.sqrt(delta)) / 2 * a);
		double x2 = (((-b) - Math.sqrt(delta)) / 2 * a);

		System.out.println("x1 = " + x1);
		System.out.println("x2 = " + x2);
		
	}

}
