package curso_programaçao;

import java.util.Scanner;

public class estrutura_condicional {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); //é uma classe usada para ler entradas (por exemplo, do teclado, arquivos, etc.)
		int hora;

		System.out.println("Qual a hora?");
		hora = sc.nextInt(); //// lê o número digitado pelo usuário

		if ( hora < 12) {
			System.out.println("Bom dia");
		}
		else {
			System.out.println("Boa tarde");
		}
		
		sc.close(); //fechar um objeto Scanner depois que você terminou de utilizá-lo.
	}
}
