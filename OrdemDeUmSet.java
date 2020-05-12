import java.util.Set;
import java.util.TreeSet;

public class OrdemDeUmSet {

	/*ORDEM DE UM SET
	 * 
  Seria possível usar uma outra implementação de conjuntos, como um TreeSet , que insere os
  elementos de tal forma que, quando forem percorridos, eles apareçam em uma ordem definida pelo
  método de comparação entre seus elementos. Esse método é definido pela interface
  java.lang.Comparable . Ou, ainda, pode se passar um Comparator para seu construtor.
  Já o LinkedHashSet mantém a ordem de inserção dos elementos.
.*/
	
	// Ordenando o Conjunto com a classe TreeSet
	
	Set<String> conjuntoNomes = new TreeSet<>(); // criando um conjunto listaNomes
	
	Set<ContaCorrente> conjuntoContaCorrente = new TreeSet<>();
	/*Utilizando a classe TreeSet<> para ordenar elementos do tipo String no conjunto não é necessario a 
	 * implementação do método compareTo pois a classe String implementa a interface Comparable e o método compareTo()*/
	public void criarConjunto() {
		
		conjuntoNomes.add("Zuila");
		conjuntoNomes.add("Flavio");
		conjuntoNomes.add("Daniel");
		conjuntoNomes.add("Ana");
		
		mostrarConjunto();
		
	}
	
	public void mostrarConjunto() {
		System.out.print(conjuntoNomes);
	}
	
	
	/* A classe TreeSet tem um método comparador comparatpr() definido pela interface
  java.lang.Comparable.  */
	
	public void criarConjuntoConta() {
		
		ContaCorrente cc1 = new ContaCorrente();
		ContaCorrente cc2 = new ContaCorrente();
		ContaCorrente cc3 = new ContaCorrente();
		
		cc1.deposita(400);
		cc1.setTitular("Claudio");
		
		cc2.deposita(1000);
		cc2.setTitular("Bibiu");
		
		cc3.deposita(300);
		cc3.setTitular("Amanda");
		
		/*Neste contexto foi necessario implementar a interface Comparable e o método compareTo() na classe ContaCorrente 
		 * para ordenar os elementos do conjunto criado pelo objeto da classe TreeSet apontado pela variavel conjuntoContaCorrente. 
		 * Conjunto ordenado pelo saldo da conta. */
		
		conjuntoContaCorrente.add(cc1);
		conjuntoContaCorrente.add(cc2);
		conjuntoContaCorrente.add(cc3);		
		
		mostrarConjuntoConta();
		
	}
	
	/* Podemos usar o enhanced-for (o "foreach") do Java 5 para percorrer qualquer Collection.
	 * Internamente o compilador vai fazer com que seja usado o Iterator da Collection dada
	 *  para percorrer a coleção. Ex :*/
	
	public void mostrarConjuntoConta() {
		for(ContaCorrente cc : conjuntoContaCorrente) {
			System.out.print(" Titular : "+ cc.getTitular()+ "- Saldo : "+ cc.getSaldo() );
		}
		
	}
	
	
}


