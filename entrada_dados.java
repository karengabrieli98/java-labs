package curso_programaçao;

import java.util.Scanner;

public class entrada_dados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int x; 
		String s1, s2, s3;
		
		x = sc.nextInt();
		sc.nextLine(); // como consumir quebra de linha que fica pendente 
		s1 = sc.nextLine();  // next line le a quebra de linha 
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("Dados digitados: ");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

	}

}
