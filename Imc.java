package cadastroimc;

public class Imc {

	private int id;
	private double altura;
	private int peso;
	
	public Imc() {
		
	}

	public Imc(int id, double altura, int peso) {
		this.id = id;
		this.altura = altura;
		this.peso = peso;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
	public double calImc(int peso, double altura) {
		return peso /(altura * altura);
	}

	@Override
	public String toString() {
		return "id: " + id + "\naltura: " + altura + "\npeso: " + peso;
	}
	
}
