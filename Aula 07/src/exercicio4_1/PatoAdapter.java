package exercicio4_1;

public class PatoAdapter extends Pato{
	private Ganso ganso;
	public PatoAdapter (Ganso ganso){
		this.ganso = ganso;
	}
	public void quack ( ){
		ganso.howk ( );
	}
}