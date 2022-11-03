package fundamentos;

import java.util.Scanner;

public class CalculadoraIMC 
{
	public static void main(String[] args)
	{
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite sua altura: ");
		Double alt = entrada.nextDouble();
		System.out.println("Digite o seu peso: ");
		Double pes = entrada.nextDouble();
		
		double IMC = pes / Math.pow(alt, 2);
		
		System.out.printf("Seu IMC é: %.2f", IMC);
		System.out.println("\n\nTabela IMC \nMenor do que 18,5 - Abaixo do peso"
				+ "\nEntre 18,5 e 24,9 - Peso normal\nEntre 25 e 29,9 - Acima do peso (sobrepeso)"
				+ "\nEntre 30 e 34,9 - Obesidade I\nEntre 35 e 39,9 - Obesidade II"
				+ "\nMaior do que 40	Obesidade III");
		
		
		
		entrada.close();
	}
}
