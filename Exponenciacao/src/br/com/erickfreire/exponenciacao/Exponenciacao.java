package br.com.erickfreire.exponenciacao;

import java.util.Scanner;

/**
 * Programa em Java que calcula a exponenciação entre dois valores
 * @author Erick Freire
 * @version 1 - Criado em 29-04-2021 as 22:56
 *
 */

public class Exponenciacao {
	public static void main(String[] args) {
		int numero1;
		int numero2;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Programa em Java que faz a exponenciação entre dois valores: ");
		
		System.out.print("Informe o primeiro valor: ");
		numero1 = entrada.nextInt();
		
		System.out.print("Informe o segundo valor: ");
		numero2 = entrada.nextInt();
		
		exponenciacao(numero1, numero2);
	}
	
	public static void exponenciacao(int n1, int n2) {
		
		int resultado = 1;
		
		for(int i = 1; i <= n2; i++) {
			resultado *= n1;
		}
		
		System.out.printf("%n%nO resultado é : %d%n", resultado);
		
	}

}
