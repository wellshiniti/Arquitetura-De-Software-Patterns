package exercicio5_1;

import java.io.IOException;

public class Teste {

	public static void main(String[] args) throws IOException {
		 
		IOFacade iofacade =  new IOFacade();
		
		//pegando endereço do arquivo de texto
		String path= "C:/teste/teste.txt";
		
		
		//abrindo arquivo de texto
		System.out.println("Abrindo arquivo de texto");
		iofacade.abrirTexto(path);

		String origem= "C:/teste/teste.class";
		String destino= "C:/teste/testebin.class";
		
		ObjetoDeTeste objetoQualquer = new ObjetoDeTeste("testeeeee");
		
		//Criando objeto
		
		
		//abrindo objeto
		System.out.println("Abrindo e salvando objeto");
		iofacade.abrirObjeto(objetoQualquer);
		
		
	}

	
	
}