package exercicio5_1;

import java.io.*;

public class IOFacade {

	

	public IOFacade() {
		
	}

	public void abrirTexto(String path) throws IOException {
		 BufferedReader buffRead = new BufferedReader(new FileReader(path));
	        String linha = "";
	        while (true) {
	            if (linha != null) {
	                System.out.println(linha);
	 
	            } else
	                break;
	            linha = buffRead.readLine();
	        }
	        buffRead.close();
	    }

	

	public void abrirBinario(String origem, String destino) throws IOException {

		try {
			File fileOrigin = new File(origem);
			File fileDestiny = new File(destino);
			BufferedInputStream in = new BufferedInputStream(new FileInputStream(fileOrigin));
			ByteArrayOutputStream baos = new ByteArrayOutputStream();

			int x = 0;
			while ((x = in.read()) != -1) {
				baos.write(x);
			}
			in.close();

			String fileContent = new String(baos.toByteArray());
			// manipular o fileContent de acordo com desejado para modificar os $Header,
			// exemplo bobo concantenado um "testado" abaixo para notares a modificação
			// sobre o original
			fileContent += "testando";
			FileOutputStream o = new FileOutputStream(fileDestiny);
			o.write(fileContent.getBytes());
			o.flush();
			o.close();

		} catch (Exception e) {
			System.out.println("Erro = " + e);
		}
	}

	public void abrirObjeto(Object objeto) throws IOException {
		
		try
		 
	    {
	      //Gera o arquivo para armazenar o objeto
	      FileOutputStream arquivoGrav =
	      new FileOutputStream("C:/teste/"+objeto.toString());
	      //Classe responsavel por inserir os objetos
	      ObjectOutputStream objGravar = new ObjectOutputStream(arquivoGrav);
	      //Grava o objeto cliente no arquivo
	      objGravar.writeObject(objeto);
	      objGravar.flush();
	      objGravar.close();
	      arquivoGrav.flush();
	      arquivoGrav.close();
	      System.out.println("Objeto gravado com sucesso!");
	    }
	    catch(Exception e) {
	      e.printStackTrace();
	    }
	    System.out.println("....");
	 
	   
	  }
	 
		
	}