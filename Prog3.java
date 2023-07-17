package package1;

import java.util.Scanner;

public class Program3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = scanner.nextInt();
		int check = 1;
		System.out.print("Output: ");
		if (number % 2 != 0) {
			for (int i = 1; i <= number; i++) {
				System.out.print(check + " ");
				check = check + 2;
			}
		} else {
			number = number - 1;
			for (int i = 1; i <= number; i++) {
				System.out.print(check + " ");
				check = check + 2;
			}
		}
	}
}