package empresa;

import java.util.ArrayList;
import java.util.Scanner;

public class Cofrinho {
	
	//Intanciando o ArrayList da lista de moedas
	private static ArrayList<Moeda> listaMoedas = new ArrayList<>();
	
	
	//Metodos
	
	/*	Função menuMoedas
	 *	Imprime a lista de moedas
	 */
	public static void menuMoedas() {
		System.out.println();
		System.out.println("Escolha a moeda");
		System.out.println("1 - Dolar");
		System.out.println("2 - Euro");
		System.out.println("3 - Real");
		System.out.println("4 - Voltar");
		System.out.println();
	}
	
	/*	Função adicionar
	 *	Imprime a lista de moedas através da função menuMoedas
	 *	Recebe a entrada do usuário e entra em um switch case para escolher as moedas
	 *	Utiliza o try catch para evitar que o usuário digite algo além de inteiros
	 *	Dentro de cada case faz o scan do valor da moeda selecionada anteriormente e adiciona na listaMoedas 
	 */
	public static void adicionar() {
		Scanner teclado = new Scanner(System.in);
		menuMoedas();
		int opcao;
		try {
			opcao = teclado.nextInt();
			switch (opcao) {
				case 1:
					System.out.println("\nInsira o valor:\n");
					Double dolar = teclado.nextDouble();
					Dolar d = new Dolar(dolar);
					listaMoedas.add(d);
					break;
				case 2:
					System.out.println("\nInsira o valor:\n");
					Double euro = teclado.nextDouble();
					Euro e = new Euro(euro);
					listaMoedas.add(e);
					break;
				case 3:
					System.out.println("\nInsira o valor:\n");
					Double real = teclado.nextDouble();
					Real r = new Real(real);
					listaMoedas.add(r);
					break;
				case 4:
					break;
				default:
					System.out.println("\nOpcao invalida, escolha novamente!\n");
					break;
			}
		}
		catch (Exception e){
			System.out.println("\nErro: Valor invalido!\n");
		}
	}
	
	/*	Função remover
	 *	Imprime a lista de moedas através da função menuMoedas
	 *	Recebe a entrada do usuário e entra em um switch case para escolher as moedas
	 *	Utiliza o try catch para evitar que o usuário digite algo além de inteiros
	 *	Dentro de cada case faz o scan do valor da moeda selecionada anteriormente e remove da listaMoedas
	 *	Utiliza o retorno em boolean do metodo remove para informar ao usuário se obteve sucesso ou não em remover a moeda
	 */
	public static void remover() {
		Scanner teclado = new Scanner(System.in);
		menuMoedas();
		int opcao;
		boolean sucesso;
		try {
			opcao = teclado.nextInt();
			switch (opcao) {
			case 1:
				System.out.println("\nInsira o valor:\n");
				Double dolar = teclado.nextDouble();
				Dolar d = new Dolar(dolar);
				sucesso = listaMoedas.remove(d);
				if (sucesso) {
					System.out.println("\nMoeda removida com sucesso!");
				}
				else {
					System.out.println("\nFalha ao remover moeda (nao encontrada)");
				}
				break;
			case 2:
				System.out.println("\nInsira o valor:\n");
				Double euro = teclado.nextDouble();
				Euro e = new Euro(euro);
				sucesso = listaMoedas.remove(e);
				if (sucesso) {
					System.out.println("\nMoeda removida com sucesso!");
				}
				else {
					System.out.println("\nFalha ao remover moeda (nao encontrada)");
				}
				break;
			case 3:
				System.out.println("\nInsira o valor:\n");
				Double real = teclado.nextDouble();
				Real r = new Real(real);
				sucesso = listaMoedas.remove(r);
				if (sucesso) {
					System.out.println("\nMoeda removida com sucesso!");
				}
				else {
					System.out.println("\nFalha ao remover moeda (nao encontrada)");
				}
				break;
			case 4:
				break;
			default:
				System.out.println("\nOpcao invalida, escolha novamente!\n");
				break;
			}
		}
		catch (Exception e){
			System.out.println("\nErro: Valor invalido!\n");
		}
	}
	
	
	/*	Função listagemMoedas
	 *	Cria um loop para todas a moedas dentro da lista de moedas e imprime na tela através do metodo info.
	 *	Caso o tamanho do array for 0 ou seja não possuir nenhuma moeda, irá informar ao usuário que está vazio.
	 */
	public static void listagemMoedas() {
		System.out.println("\nLista de moedas:");
		for(Moeda Moeda : listaMoedas) {
			Moeda.info();
		}
		if ((listaMoedas.size()) == 0){
			System.out.println("Cofrinho vazio");
		}
		System.out.println();
	}
	
	/*	Função totalConvertido
	 *	Cria um loop para todas a moedas dentro da lista de moedas e incrementa o valor obtido através do metodo converter.
	 */
	public static void totalConvertido() {
		Double totalReal = 0d;
		for(Moeda Moeda : listaMoedas) {
			totalReal += Moeda.converter();			
		}
		System.out.println("\nTotal no cofrinho:");
		System.out.printf("R$%.2f\n\n",totalReal);
	}
	
}