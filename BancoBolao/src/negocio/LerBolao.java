package negocio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import persistencia.PessoaDAO;

public class LerBolao {
	public void separarLinha(String linha) {

		String[] aux = linha.split(";");
		PessoaDAO x=new PessoaDAO();
		Pessoa p = new Pessoa();
		p.setSelecoesQuarta(new ArrayList<String>());
		p.setPlacaresQuarta(new ArrayList<Integer>());
		
		p.setSelecoesSemi(new ArrayList<String>());
		p.setPlacaresSemi(new ArrayList<Integer>());
		
		p.setSelecoesFinal(new ArrayList<String>());
		p.setPlacaresFinal(new ArrayList<Integer>());
		

		p.setNome(aux[0]);
		
		p.getSelecoesQuarta().add(aux[1]);
		p.getPlacaresQuarta().add(Integer.parseInt(aux[2]));
		p.getSelecoesQuarta().add(aux[3]);
		p.getPlacaresQuarta().add(Integer.parseInt(aux[4]));
		p.getSelecoesQuarta().add(aux[5]);
		p.getPlacaresQuarta().add(Integer.parseInt(aux[6]));
		p.getSelecoesQuarta().add(aux[7]);
		p.getPlacaresQuarta().add(Integer.parseInt(aux[8]));
		p.getSelecoesQuarta().add(aux[9]);
		p.getPlacaresQuarta().add(Integer.parseInt(aux[10]));
		p.getSelecoesQuarta().add(aux[11]);
		p.getPlacaresQuarta().add(Integer.parseInt(aux[12]));
		p.getSelecoesQuarta().add(aux[13]);
		p.getPlacaresQuarta().add(Integer.parseInt(aux[14]));
		p.getSelecoesQuarta().add(aux[15]);
		p.getPlacaresQuarta().add(Integer.parseInt(aux[16]));
		
		p.getSelecoesSemi().add(aux[17]);
		p.getPlacaresSemi().add(Integer.parseInt(aux[18]));
		p.getSelecoesSemi().add(aux[19]);
		p.getPlacaresSemi().add(Integer.parseInt(aux[20]));
		p.getSelecoesSemi().add(aux[21]);
		p.getPlacaresSemi().add(Integer.parseInt(aux[22]));
		p.getSelecoesSemi().add(aux[23]);
		p.getPlacaresSemi().add(Integer.parseInt(aux[24]));
		
		p.getSelecoesFinal().add(aux[25]);
		p.getPlacaresFinal().add(Integer.parseInt(aux[26]));
		p.getSelecoesFinal().add(aux[27]);
		p.getPlacaresFinal().add(Integer.parseInt(aux[28]));
		
		p.setCampeao(aux[29]);
		x.inserir(p);
		
		
		

		
	}

	public void ler(File file) {

		FileReader arquivo;
		try {
			arquivo = new FileReader(file);
			BufferedReader leitura = new BufferedReader(arquivo);

			while (leitura.ready()) {
				
				separarLinha(leitura.readLine());
				 
			}

		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
