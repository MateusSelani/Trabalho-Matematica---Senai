package ProjetoSanduiche;
import java.util.Scanner;

public class Desafio {	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		/* Encapsulamento de objetos "orientação a objetos" */
		SandubaMedio sMedio = new SandubaMedio();
		SandubaGrande sGrande = new SandubaGrande();
		SandubaSuper sSuper = new SandubaSuper();
		
		/* Variáveis para leitura Scanner */
		int snd, qnt;
		
		do {
			System.out.print("1 - Sanduiche Medio\n"
					+ "2 - Sanduiche Grande\n"
					+ "3 - Sanduiche Super\n\n"
					+ "Escolha o Sanduiche: ");
			
			/* Receber numero de sanduiche */
			snd = teclado.nextInt();
			/* Verificar número digitado */
			if (snd >= 4 || snd <= 0) {
				System.out.println("\nNúmero incorreto!\n");
			}
			/* Fim estrutura de repetição */
		} while (snd >= 4 || snd <= 0);

		/* Receber quantidade */
		System.out.print("Digite a quantidade de ");
		/* Atribuindo nome do sanduiche ao numero escolhido */			
		Metodos.nSandu(snd);
		/* Ler quantidade */
		qnt = teclado.nextInt();
		
		if(snd == 1) {
			/* Valores do Sanduiche Medio */
			System.out.println("\n====== Sanduiche Medio ======\n\n"
					+ "Quantidade de Queijo Utilizado: " + Metodos.calcSandu(sMedio.queijo, qnt) + "kg\n" 
					+ "Quantidade de Frango Utilizado: " + Metodos.calcSandu(sMedio.frango, qnt) + "kg\n"
					+ "Quantidade de Salada Utilizada: " + Metodos.calcSandu(sMedio.salada, qnt) + "kg\n" 
					+ "Valor Total: R$ " + (sMedio.valor * qnt) + " reais\n");
			/* Fim Valores do Sanduiche Medio */
		}
		else if(snd == 2) {
			/* Valores do Sanduiche Grande */
			System.out.println("\n====== Sanduiche Grande ======\n\n"
					+ "Quantidade de Queijo Utilizado: " + Metodos.calcSandu(sGrande.queijo, qnt) + "kg\n" 
					+ "Quantidade de Frango Utilizado: " + Metodos.calcSandu(sGrande.frango, qnt) + "kg\n"
					+ "Quantidade de Salada Utilizada: " + Metodos.calcSandu(sGrande.salada, qnt) + "kg\n" 
					+ "Valor Total: R$ " + (sGrande.valor * qnt) + " reais\n");
			/* Fim Valores do Sanduiche Grande */
		}
		else {
			/* Valores do Sanduiche Super */
			System.out.println("\n====== Sanduiche Super ======\n\n"
					+ "Quantidade de Queijo Utilizado: " + Metodos.calcSandu(sSuper.queijo, qnt) + "kg\n" 
					+ "Quantidade de Frango Utilizado: " + Metodos.calcSandu(sSuper.frango, qnt) + "kg\n"
					+ "Quantidade de Salada Utilizada: " + Metodos.calcSandu(sSuper.salada, qnt) + "kg\n" 
					+ "Valor Total: R$ " + (sSuper.valor * qnt) + " reais\n");
			/* Fim Valores do Sanduiche Super */
			}
		
	}
}
