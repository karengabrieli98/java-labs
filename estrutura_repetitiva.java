package curso_programaçao;

import java.util.Scanner;

public class estrutura_repetitiva {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt(); //declaração é feita uma vez só 
		int y = sc.nextInt(); // essa linha espera que o usuário digite um número inteiro e armazena esse número na variável
		while (x != y) {
			if (x < y) {
				System.out.println("Crescente");
			}
			
			else {
				System.out.println("Descrecente");
			}
			
			x = sc.nextInt(); 
			y = sc.nextInt();
			
		}
		
		sc.close();
	}
}
