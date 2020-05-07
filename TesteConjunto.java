import java.util.Set;
import java.util.HashSet;

public class TesteConjunto {
 /*   Interface Set :
  
  Um conjunto ( Set ) funciona de forma an�loga aos conjuntos da matem�tica, ele � uma cole��o que
  n�o permite elementos duplicados.  
  Outra caracter�stica fundamental dele � o fato de que a ordem em que os elementos s�o armazenados
 pode n�o ser a ordem na qual eles foram inseridos no conjunto. A interface n�o define como deve ser
 este comportamento. Tal ordem varia de implementa��o para implementa��o.
 
 - N�o existe elementos duplicados !
 - Ao percorrer um conjunto sua ordem n�o � conhecida !
 
   Um conjunto � representado pela interface Set e tem como suas principais implementa��es 
    as  classes : HashSet , LinkedHashSet e TreeSet .
     
    O c�digo a seguir cria um conjunto e adiciona diversos elementos, e alguns repetidos :   
     
  */
	
	public static void main(String [] args) {
		
		Set<String> conjunto1 = new HashSet<>();		
		
		conjunto1.add("Gerente");
		conjunto1.add("Diretor");
		conjunto1.add("Presidente");
		conjunto1.add("Secretaria");
		conjunto1.add("Funcionario");
		conjunto1.add("Diretor"); // repetido portanto retorna falso
		
				
		/* O m�todo add() retorna true se este conjunto ainda n�o continha o elemento especificado*/
		
		System.out.println(conjunto1);
		
		
		
	}
	
	/*
	O uso de um Set pode parecer desvantajoso, j� que ele n�o armazena na ordem, e n�o aceita
	elementos repetidos. N�o h� m�todos que trabalham com �ndices, como o get(int) que as listas
	possuem. A grande vantagem do Set � que existem implementa��es, como a HashSet , que possui
	uma performance incompar�vel com em rela��o �s List s , quando usado para pesquisa (m�todo contains por
	exemplo).
	
	A busca em um Set pode ser mais r�pida do que em um objeto do tipo List , pois diversas
    implementa��es utilizam-se de tabelas de espalhamento (hash tables), realizando a busca para tempo
    linear (O(1)).
	*/
	
	
	
	
	
	
}
