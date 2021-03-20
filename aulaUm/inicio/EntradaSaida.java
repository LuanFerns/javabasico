package aulaUm.inicio;

import java.util.Scanner;

public class EntradaSaida {

	public static void main(String[] args) {
		
		String nome;
		int idade;
		double altura;
		// Ctrl + Shift + O para importar
		Scanner leitor = new Scanner (System.in);
		System.out.println("Insira seu nome: ");
		nome = leitor.nextLine(); // line = texto
		System.out.println("Insira sua idade");
		idade = leitor.nextInt(); // int = números
		System.out.println("Insira sua altura");
		altura = leitor.nextDouble();
		
		System.out.println("Seu nome é: "+nome+" Você tem: "+idade+ " anos, e possui "+altura+ "m de altura");
	}

}
