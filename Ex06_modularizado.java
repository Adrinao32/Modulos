package Modularizacao;

import java.util.Scanner;

import util.Calculo;


public class Ex06_modularizado {

	public static void main(String[] args) {
		

		double celcius, fahrenheit;
		
		Scanner tc = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Celcius: ");
		celcius = tc.nextFloat();
		
		fahrenheit = Calculo.fahrenheit(celcius);
		
		System.out.printf("a temperatura em celcius %.2f para Fahrenheit é: %.2f ", celcius, fahrenheit);
		
		tc.close();

	}

}
