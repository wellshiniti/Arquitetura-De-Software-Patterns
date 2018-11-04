package exercicio4_2;

import java.util.*;

class NewSomador extends SomadorExistente implements SomadorEsperado {

	public int somaVetor(int[] vetor) {

		ArrayList<Integer> lista = new ArrayList<Integer>();

		for (int i = 0; i < vetor.length; i++) {
			lista.add(vetor[i]);
		}

		return this.somaLista(lista);
	}

}