package Modularizacao;

import java.util.Scanner;

public class Ex05_modularizado {

	public static void main(String[] args) {
		
		int a, b, c;
		
		Scanner tc = new Scanner(System.in);
		
		System.out.println("Digite um valor para A: ");
		a = tc.nextInt();
		
		System.out.println("Digite um valor para B: ");
		b = tc.nextInt();
		
		c = a;
		a = b;
		b = c;
		
			
		System.out.println("Valor de A: " + a);
		System.out.println("Valor de B: " + b);		

		tc.close();

	}

}
