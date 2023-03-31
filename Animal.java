package javaPOO;

public class Animal {
	
	
	private String nome;
	private double peso;

	
	public Animal() {}
	public Animal(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}

	public void Imprimir() {
		System.out.println(
				   "Nome: " + this.nome +
				   "\nPeso: " + this.peso);
	}

	
		public void setNome(String nome) {
			this.nome = nome;
		}
	
		public void setPeso(double peso) {
			this.peso = peso;
		}
		
}

