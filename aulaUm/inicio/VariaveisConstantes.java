package aulaUm.inicio;
/*
 * Classe demonstrativa de vari�veis e constantes
 * 
 * Vers�o 1.0
 * 
 * Autor: Luan Fernandes
 * 
 */
public class VariaveisConstantes {

	public static void main(String[] args) {
		
		// Cria��o de constantes
		
		final double PI = 3.1415; 
		
		// Cria��o de vari�veis
		String nome = "Luan Fernandes"; 
		int idade = 17;
		double peso = 60.5, altura = 1.74; 
		char sexo = 'M', cnh = 'A';
		boolean doadorOrgaos = false;
		
		System.out.println("Seu nome �: "+nome);
		System.out.println("Sua idade �: "+idade+" anos");
		System.out.println("Seu peso e altura s�o, respectivamente: "+peso+"kg e "+altura+'m');
		System.out.println("Seu sexo �: "+sexo);
		System.out.println("Tipo de CNH: "+cnh);
		System.out.println("Ele � doador de �rg�os? "+doadorOrgaos);
		System.out.println("A constante Pi �: "+PI);
	}

}
