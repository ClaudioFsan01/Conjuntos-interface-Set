import java.util.Set;
import java.util.HashSet;

public class TesteConjunto {
 /*   Interface Set :
  
  Um conjunto ( Set ) funciona de forma análoga aos conjuntos da matemática, ele é uma coleção que
  não permite elementos duplicados.  
  Outra característica fundamental dele é o fato de que a ordem em que os elementos são armazenados
 pode não ser a ordem na qual eles foram inseridos no conjunto. A interface não define como deve ser
 este comportamento. Tal ordem varia de implementação para implementação.
 
 - Não existe elementos duplicados !
 - Ao percorrer um conjunto sua ordem não é conhecida !
 
   Um conjunto é representado pela interface Set e tem como suas principais implementações 
    as  classes : HashSet , LinkedHashSet e TreeSet .
     
    O código a seguir cria um conjunto e adiciona diversos elementos, e alguns repetidos :   
     
  */
	
	public static void main(String [] args) {
		
		Set<String> conjunto1 = new HashSet<>();		
		
		conjunto1.add("Gerente");
		conjunto1.add("Diretor");
		conjunto1.add("Presidente");
		conjunto1.add("Secretaria");
		conjunto1.add("Funcionario");
		conjunto1.add("Diretor"); // repetido portanto retorna falso
		
				
		/* O método add() retorna true se este conjunto ainda não continha o elemento especificado*/
		
		System.out.println(conjunto1);
		
		
		
	}
	
	/*
	O uso de um Set pode parecer desvantajoso, já que ele não armazena na ordem, e não aceita
	elementos repetidos. Não há métodos que trabalham com índices, como o get(int) que as listas
	possuem. A grande vantagem do Set é que existem implementações, como a HashSet , que possui
	uma performance incomparável com em relação às List s , quando usado para pesquisa (método contains por
	exemplo).
	
	A busca em um Set pode ser mais rápida do que em um objeto do tipo List , pois diversas
    implementações utilizam-se de tabelas de espalhamento (hash tables), realizando a busca para tempo
    linear (O(1)).
	*/
	
	
	
	
	
	
}
