package curso_programaçao;

import java.util.Scanner;

public class Exercicio_estruturac_condicional {


		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in); //é uma classe usada para ler entradas (por exemplo, do teclado, arquivos, etc.)
			int nota = 5;

			System.out.println("Qual a nota do aluno?");
			nota  = sc.nextInt(); //// lê o número digitado pelo usuário

			if ( nota <= 10) {
				System.out.println("Aprovado!");
			}
			else {
				System.out.println("Reprovado!");
			}
			
			sc.close(); //fechar um objeto Scanner depois que você terminou de utilizá-lo.
		}
	}

