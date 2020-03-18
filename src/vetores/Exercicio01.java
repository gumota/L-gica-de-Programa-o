package vetores;

import java.util.Scanner;

public class Exercicio01 {

	private static Scanner in;

	public static void main(String[] args) {

		in = new Scanner(System.in);
		int[] vet = new int[5];
		double media = 0;
		int cont = 0;
		int impares = 0;

		System.out.println("Digite 50 valores e obtenha dados sobre eles");

		for (int i = 0; i < 5; i++) {
			vet[i] = in.nextInt();

			if (vet[i] >= 10 && vet[i] <= 200) {
				media += vet[i];
				cont++;

			}
			if (vet[i] % 2 != 0) {
				impares += vet[i];
			}

		}
		System.out.println(media = media / cont);
		System.out.println(impares);

	}

}
