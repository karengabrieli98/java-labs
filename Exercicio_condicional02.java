package curso_programaçao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_condicional02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);

		double nota1 = sc.nextDouble();
		double nota2 = sc.nextDouble();
		
		double notaFinal = nota1 + nota2;
		System.out.printf("Nota final = %.1f%n" , notaFinal ); //system.out.println não aceita formatação com especificadores como %.1f. Para isso, você deve usar System.out.printf
		
		if (notaFinal < 60.0) {
		System.out.println("REPROVADO");
	}
		sc.close();

}
}
