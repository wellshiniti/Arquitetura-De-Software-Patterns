package exercicio6_2;

import java.util.Scanner;

public class Teste {
	public static String tipo;
	public static void main(String[] args) {
		
		int[] vetor = new int[15];
		
		vetor[0] = 1;
		vetor[1] = 15;
		vetor[2] = 6;
		vetor[3] = 78;
		vetor[4] = 12;
		vetor[5] = 98;
		vetor[6] = 3;
		vetor[7] = 45;
		vetor[8] = 88;
		vetor[9] = 34;
		vetor[10] = 87;
		vetor[11] = 113;
		vetor[12] = 345;
		vetor[13] = 122;
		vetor[14] = 172;
		
		while(true) {
		
			System.out.println("Insira 'Insert', 'Bubble', 'Select' ou 'Quick'  para determinar a ordenação");
			Scanner entrada = new Scanner(System.in);
			String input = entrada.nextLine();
			tipo = input;
		
		
			if(tipo.equals("Insert")) {
				Formatacao format = new InsertSort();
				Ordem ordem = new Ordem(format);
				ordem.publish(vetor);
				
				for(int l = 0; l< vetor.length; l++) {
					System.out.print(vetor[l]+" - ");
				}
			}else if(tipo.equals("Bubble")) {
				Formatacao format = new BubbleSort();
				Ordem ordem = new Ordem(format);
				ordem.publish(vetor);
				
				for(int l = 0; l< vetor.length; l++) {
					System.out.print(vetor[l]+" - ");
				}
			}else if(tipo.equals("Select")) {
				Formatacao format = new SelectSort();
				Ordem ordem = new Ordem(format);
				ordem.publish(vetor);
				
				for(int l = 0; l< vetor.length; l++) {
					System.out.print(vetor[l]+" - ");
				}
			}else if(tipo.equals("Quick")) {
				Formatacao format = new SelectSort();
				Ordem ordem = new Ordem(format);
				ordem.publish(vetor);
				
				for(int l = 0; l< vetor.length; l++) {
					System.out.print(vetor[l]+" - ");
				}
			}else {
				System.out.println("Inserir um valor correto\n");
			}
		}
		
	}

}