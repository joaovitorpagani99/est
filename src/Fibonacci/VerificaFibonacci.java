package Fibonacci;

import java.util.Scanner;

public class VerificaFibonacci {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int numero = scanner.nextInt();

		int a = 0;
		int b = 1;
		while (b < numero) {
			int temp = b;
			b = a + b;
			a = temp;
		}

		if (b == numero) {
			System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
		} else {
			System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
		}
	}
}
