package exercicio6_2;

public class Ordem {
	int x, y;
	
	private final Formatacao formatacao;
	
	public Ordem(Formatacao formatacao) {
		this.formatacao = formatacao;
	}
	
	public int[] publish (int vetor[]) {
		formatacao.format(vetor,x, y);
		return vetor;
	}
	
}