package empresa;

import java.util.Objects;

public abstract class Moeda {
	
	//Variaveis
	private double valor;
	
	//Construtor
	public Moeda(double valor) {
		this.valor = valor;
	}
	
	//Get and Set
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	//HashCode e Equals
	@Override
	public int hashCode() {
		return Objects.hash(valor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Moeda other = (Moeda) obj;
		return Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor);
	}

	//Metodos
	abstract void info();
	abstract double converter();
}