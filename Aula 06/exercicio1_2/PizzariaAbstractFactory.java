package exercicio1_2;

import exercicio1_2.Produto;

public interface PizzariaAbstractFactory {
	Produto getTypeInstance(String diaDaSemana);
}
