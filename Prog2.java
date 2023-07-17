package package1;

import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = scanner.nextInt();
        for (int i = 1; i <= a; i++) {
            int n = 2 * i - 1;
            System.out.print(n + " ");
        }
    }
}