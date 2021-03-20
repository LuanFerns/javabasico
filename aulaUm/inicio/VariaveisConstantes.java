package aulaUm.inicio;
/*
 * Classe demonstrativa de variáveis e constantes
 * 
 * Versão 1.0
 * 
 * Autor: Luan Fernandes
 * 
 */
public class VariaveisConstantes {

	public static void main(String[] args) {
		
		// Criação de constantes
		
		final double PI = 3.1415; 
		
		// Criação de variáveis
		String nome = "Luan Fernandes"; 
		int idade = 17;
		double peso = 60.5, altura = 1.74; 
		char sexo = 'M', cnh = 'A';
		boolean doadorOrgaos = false;
		
		System.out.println("Seu nome é: "+nome);
		System.out.println("Sua idade é: "+idade+" anos");
		System.out.println("Seu peso e altura são, respectivamente: "+peso+"kg e "+altura+'m');
		System.out.println("Seu sexo é: "+sexo);
		System.out.println("Tipo de CNH: "+cnh);
		System.out.println("Ele é doador de órgãos? "+doadorOrgaos);
		System.out.println("A constante Pi é: "+PI);
	}

}
