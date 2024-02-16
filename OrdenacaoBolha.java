package ordenacao;

public class OrdenacaoBolha <T extends Comparable<T>> extends OrdenacaoAbstract<T> {

	public void ordenar() {
		int i, j;
		T[] vetor = getInfo();
		int n = vetor.length;
		
		for(i=n-1; i>=1; i--) {
			for(j=0; j<=i-1; j++) {
				if (vetor[j].compareTo(vetor[j+1])>0) {
					trocar(j, j+1);
				}
			}
		}
	}
	
}
