package Modularizacao;

import java.util.Scanner;

import util.Calculo;


public class Ex07_modularizado {

	public static void main(String[] args) {
		
		double dolar, real = 1;
		
		Scanner tc = new Scanner(System.in);
		
		System.out.println("Quantidade em Dolares: ");
		dolar = tc.nextFloat();
		
		real = Calculo.cotacao(dolar);
		
		System.out.println("Valor em reais è: " + real);
		
		tc.close();

	}
}