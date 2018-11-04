package exercicio1_2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a data: ");
		String date = teclado.nextLine();
		System.out.println("Digite o ingrediente");
		String produto = teclado.nextLine();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy");
		DayOfWeek dayOfWeek = LocalDate.parse(date, formatter).getDayOfWeek();
		
		int value = dayOfWeek.getValue();

		System.out.println(dayOfWeek);
		
		if(produto.equals("Pizza")) {
			PizzariaAbstractFactory pizzariaFactory = new PizzaFactory();
			Produto pizza = pizzariaFactory.getTypeInstance(String.valueOf(value));		
			pizza.printIngredientes();
			
		}else if(produto.equals("Calzone")){
			PizzariaAbstractFactory calzoneFactory = new CalzoneFactory();
			Produto calzone = calzoneFactory.getTypeInstance(String.valueOf(value));		
			calzone.printIngredientes();
		}			
	}
}
