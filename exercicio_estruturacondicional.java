package curso_programaçao;

import java.util.Scanner;

public class exercicio_estruturacondicional { //encadeameto de estruturas condicionais 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int numero, numero2, numero3; 
		
		System.out.println("Qual o maior número? ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if ( a  < b && a < c ) {
			System.out.println("Número menor!");
		}
		else if (b < c ) { 
			System.out.println("MENOR = " + b);
		} else {
			System.out.println("MENOR = " + c);
		}
		
		
		sc.close();
	}

}
