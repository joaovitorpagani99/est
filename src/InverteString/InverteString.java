package InverteString;

import java.util.Scanner;

public class InverteString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite uma string: ");
		String string = scanner.nextLine();

		String invertedString = "";
		for (int i = string.length() - 1; i >= 0; i--) {
			invertedString += string.charAt(i);
		}

		System.out.println("String invertida: " + invertedString);
	}
}
