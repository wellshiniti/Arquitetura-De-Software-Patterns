package exercicio6_1;

public class RetornoSemana {

	public Semana getSemana(int semana) {
		// Verificar o dia da semana desejado
		  {
			    // Verificar o dia da semana desejado
			    switch(semana)
			    {
			      case 1: return new Sunday();
			      case 2: return new Monday();
			      case 3: return new Tuesday();
			      case 4: return new Wednesday();
			      case 5: return new Thursday();
			      case 6: return new Friday();
			      case 7: return new Saturday();
			    }
	    }
		  
		// Dia da semana invalido
			throw new IllegalArgumentException( semana + " é um parametro inválida para a semana!");

	}

	public Semana getSemana(String semana) {
		try {
			// Obter a instancia da classe desejada
			return (Semana) Class.forName(semana).newInstance();
		} catch (Exception exception) {
			// Dia da semana invalido
			throw new IllegalArgumentException("'" + semana + "' é um parametro inválida para a semana");
		}
	}

}