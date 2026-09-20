package curso_programaçao;

import java.util.Scanner;

public class Exerci02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String x; // para ler letras 
		x = sc.next();
		System.out.println("Voce digitou: " + x);
		
		sc.close();
	}
	
	public class Exercicio02{
	public static void main(String[] args) {
		
       Scanner sc = new Scanner(System.in);
		
		int x; // para ler numeros inteiros 
		x = sc.nextInt();
		System.out.println("Voce digitou: " + x);
		
		sc.close();
		
		
	}
	
  }
	
	
	

	public class Exercicio03 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        double x = sc.nextDouble(); // para ler numero com decimais 
	        System.out.println("Você digitou: " + x);
	        sc.close();
	    }
	}
	
	public class Exercicio04{
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        char x;
	        x = sc.next().charAt(0); // ler um caractere
	        
	        System.out.println("Você digitou: " + x);
	        sc.close();
	    }
	}
	
	
	public class Exercicio05{
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        String x;
	        int y;
	        double z;
	        x = sc.next();
	        y = sc.nextInt();
	        z = sc.nextDouble();
	        
	        System.out.println("Você digitou: ");
	        System.out.println(x);
	        System.out.println(y);
	        System.out.println(z);
	        
	        sc.close();
	    }
	}


}
