package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a,b;
		a = sc.nextInt();
		int soma = 0;
		
		while(sc.hasNextInt()) {
			
			b = sc.nextInt();
			soma = a + b; 
			System.out.println(soma);
			a = sc.nextInt();
		}
		sc.close();

	}

}
