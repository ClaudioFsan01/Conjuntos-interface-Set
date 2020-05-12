import java.util.Set;
import java.util.TreeSet;

public class OrdemDeUmSet {

	/*ORDEM DE UM SET
	 * 
  Seria poss�vel usar uma outra implementa��o de conjuntos, como um TreeSet , que insere os
  elementos de tal forma que, quando forem percorridos, eles apare�am em uma ordem definida pelo
  m�todo de compara��o entre seus elementos. Esse m�todo � definido pela interface
  java.lang.Comparable . Ou, ainda, pode se passar um Comparator para seu construtor.
  J� o LinkedHashSet mant�m a ordem de inser��o dos elementos.
.*/
	
	// Ordenando o Conjunto com a classe TreeSet
	
	Set<String> conjuntoNomes = new TreeSet<>(); // criando um conjunto listaNomes
	
	Set<ContaCorrente> conjuntoContaCorrente = new TreeSet<>();
	/*Utilizando a classe TreeSet<> para ordenar elementos do tipo String no conjunto n�o � necessario a 
	 * implementa��o do m�todo compareTo pois a classe String implementa a interface Comparable e o m�todo compareTo()*/
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
	
	
	/* A classe TreeSet tem um m�todo comparador comparatpr() definido pela interface
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
		
		/*Neste contexto foi necessario implementar a interface Comparable e o m�todo compareTo() na classe ContaCorrente 
		 * para ordenar os elementos do conjunto criado pelo objeto da classe TreeSet apontado pela variavel conjuntoContaCorrente. 
		 * Conjunto ordenado pelo saldo da conta. */
		
		conjuntoContaCorrente.add(cc1);
		conjuntoContaCorrente.add(cc2);
		conjuntoContaCorrente.add(cc3);		
		
		mostrarConjuntoConta();
		
	}
	
	/* Podemos usar o enhanced-for (o "foreach") do Java 5 para percorrer qualquer Collection.
	 * Internamente o compilador vai fazer com que seja usado o Iterator da Collection dada
	 *  para percorrer a cole��o. Ex :*/
	
	public void mostrarConjuntoConta() {
		for(ContaCorrente cc : conjuntoContaCorrente) {
			System.out.print(" Titular : "+ cc.getTitular()+ "- Saldo : "+ cc.getSaldo() );
		}
		
	}
	
	
}


