package negocio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import persistencia.PessoaDAO;

public class EscreverBolao {
	public void escrever(String mensagem, File file) {

		try {
			FileWriter arquivo = new FileWriter(file);
			arquivo.write(mensagem);
			arquivo.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public String boloesEscritos() {
		String boloes=" ";
		PessoaDAO pessoa=new PessoaDAO();
		ArrayList<Pessoa>cadastros=new ArrayList<Pessoa>();
		cadastros=pessoa.listar();
		for(int i=0;i<cadastros.size();i++) {
			boloes+=cadastros.get(i).getNome()+";"+cadastros.get(i).getSelecoesQuarta().get(0)+";"+cadastros.get(i).getPlacaresQuarta().get(0)+";"+
					cadastros.get(i).getSelecoesQuarta().get(1)+";"+cadastros.get(i).getPlacaresQuarta().get(1)+";"+
					cadastros.get(i).getSelecoesQuarta().get(2)+";"+cadastros.get(i).getPlacaresQuarta().get(2)+";"+
					cadastros.get(i).getSelecoesQuarta().get(3)+";"+cadastros.get(i).getPlacaresQuarta().get(3)+";"+
					cadastros.get(i).getSelecoesQuarta().get(4)+";"+cadastros.get(i).getPlacaresQuarta().get(4)+";"+
					cadastros.get(i).getSelecoesQuarta().get(5)+";"+cadastros.get(i).getPlacaresQuarta().get(5)+";"+
					cadastros.get(i).getSelecoesQuarta().get(6)+";"+cadastros.get(i).getPlacaresQuarta().get(6)+";"+
					cadastros.get(i).getSelecoesQuarta().get(7)+";"+cadastros.get(i).getPlacaresQuarta().get(7)+";"+
					
					cadastros.get(i).getSelecoesSemi().get(0)+";"+cadastros.get(i).getPlacaresSemi().get(0)+";"+
					cadastros.get(i).getSelecoesSemi().get(1)+";"+cadastros.get(i).getPlacaresSemi().get(1)+";"+
					cadastros.get(i).getSelecoesSemi().get(2)+";"+cadastros.get(i).getPlacaresSemi().get(2)+";"+
					cadastros.get(i).getSelecoesSemi().get(3)+";"+cadastros.get(i).getPlacaresSemi().get(3)+";"+
					
					cadastros.get(i).getSelecoesFinal().get(0)+";"+cadastros.get(i).getPlacaresFinal().get(0)+";"+
					cadastros.get(i).getSelecoesFinal().get(1)+";"+cadastros.get(i).getPlacaresFinal().get(1)+";"+
					cadastros.get(i).getCampeao()+"\n";
		}
		return boloes;
	}
	
	
}
