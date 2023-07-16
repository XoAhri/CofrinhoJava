package empresa;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		//ao invocar a função menu se da inicio a todo o ciclo do programa
		System.out.println("Bem vindo ao seu cofrinho!");
		menu();
		}
	
	/*	Função menu
	 * 	Cria um loop utilizando while que irá imprimir o menu até o usuário decidir encerrar o programa
	 * 	Recebe a entrada do usuário e entra em um switch case para escolher as opções
	 *	Utiliza o try catch para evitar que o usuário digite algo além de inteiros
	 *	Dependendo da opção escolhida chama a função da classe cofrinho sendo elas adicionar remover listagemMoedas e totalConvertido
	 */
	public static void menu() {
		boolean continuar = true;
		int opcao = 0;
		Scanner teclado = new Scanner(System.in);
		while (continuar){
			System.out.println();
			System.out.println("*******Menu*******");
			System.out.println("1 - Adicionar Moeda");
			System.out.println("2 - Remover Moeda");
			System.out.println("3 - Listar Moedas");
			System.out.println("4 - Saldo total em real");
			System.out.println("5 - Sair");
			System.out.println("Escolha uma opcao\n");

			try {
				opcao = teclado.nextInt();
			
				switch (opcao) {
				case 1:
					Cofrinho.adicionar();
					break;
				case 2:
					Cofrinho.remover();
					break;
				case 3:
					Cofrinho.listagemMoedas();
					break;
				case 4:
					Cofrinho.totalConvertido();
					break;
				case 5:
					System.out.println("\nProjeto desenvolvido por:");
					System.out.println("Lucas Minetto");
					System.out.println("RU : 3923971");
					System.out.println("Encerrando programa...");
					continuar = false;
					break;
				default:
					System.out.println("\nOpcao invalida, escolha novamente!\n");
					break;
				}
			}
			catch (Exception e){
				System.out.println("\nErro: Digite apenas o numero da opcao desejada!\n");
				menu();
				break;
			}	
		}
		teclado.close();
	}
}
