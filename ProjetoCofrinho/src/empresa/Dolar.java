package empresa;

public class Dolar extends Moeda{

	//Declarando variaveis
	Double valor;
	
	//Construtor
	public Dolar(double valor) {
		super(valor);
		this.valor = valor;
	}

	
	//Get and Set
	public double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}


	//Metodos
	
	/*	Função info
	 *	Imprime o valor referente a moeda 
	 */
	@Override
	void info() {
		System.out.printf("Dolar: $%.2f\n",valor);
	}
	/*	Função converter
	 *	retorna o valor * 4.8 que seria o equivalente a conversão em real
	 */
	@Override
	double converter() {
		return valor * 4.8;
	}
	
}