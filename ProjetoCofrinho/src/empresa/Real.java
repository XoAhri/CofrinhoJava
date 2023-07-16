package empresa;

public class Real extends Moeda {
	
	//Declarando variaveis
	Double valor;

	//Construtor
	public Real(double valor) {
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
		System.out.printf("Real: $%.2f\n",valor);
	}
	/*	Função converter
	 *	retorna o valor propriamente dito pois já está em real
	 */
	@Override
	double converter() {
		return valor;
	}
	
}