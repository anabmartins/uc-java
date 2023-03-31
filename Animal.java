package javaPOO;

public class Animal {
	
	/*criando os atributos*/
	
	public String nome;
	public double peso;
	
	
	public Animal() {}
	
	public void Imprimir() {
		System.out.println(
						   "Nome: " + this.nome +
						   "\nPeso: " + this.peso);
	}
	
}
