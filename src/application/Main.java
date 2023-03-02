package application;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	// Exerc 1
	public static void main(String[] args) {

		int indice = 13, soma = 0, k = 0;

		while (k < indice) {
			k += 1;
			soma += k;
		}

		System.out.println(soma);

	// Exerc 2
		Scanner sc = new Scanner(System.in);

		int n = 1, m = 0;

		System.out.print("Enter the v value: ");
		int v = sc.nextInt();
		System.out.print("Enter the comparator number: ");
		int c = sc.nextInt();
		System.out.println();

		System.out.print(m + ", ");
		System.out.print(n + ", ");

		for (int i = 0; i < v; i++) {
			n = n + m;
			m = n - m;
			System.out.print(n + ", ");
			if (n == c) {
				i = v;
				System.out.print("<-- Matched!");
			}
		}
		System.out.println();
		
	// Exerc 4
		System.out.println("Region Numbers: ");
		int regions = sc.nextInt();
		double totalValue = 0;
		
		Map <String, Double> total = new HashMap<>();
		
		for (int i = 0; i < regions; i++) {
			System.out.print("Enter the region: ");
			String st = sc.next();
			System.out.print("Enter the value: ");
			double val = sc.nextDouble();
			totalValue += val;
			total.put(st, val);
		}
		System.out.println(String.format("Total Value: %.2f ", totalValue));
		for (Map.Entry<String, Double> keys: total.entrySet()) {
			double perct = (keys.getValue() * 100) / totalValue;
			System.out.println(String.format("Region: %s - "
			+ "Value: %.1f percent", keys.getKey(), perct));
		}
		
	// Exerc 5
		System.out.print("Type the text: ");
		String text = sc.next();
		String[] words = text.split(("(?!^)"));
		
		System.out.print("Reversed: ");
		for(int i = words.length - 1; i >= 0; i--) {
			System.out.print(words[i]);
		}
		sc.close();
	}
}
