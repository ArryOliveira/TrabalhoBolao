package negocio;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import persistencia.PessoaDAO;

public class Cadastros extends JFrame {
	
	public Cadastros() {
	setSize(350,400);
	setTitle("Bolões Cadastrados");
	String []colunas= {
			"Bolões"
	};
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	JTable jtable=new JTable(cadastrado(),colunas);
	JScrollPane barra=new JScrollPane(jtable);
	add(barra);
	
	setVisible(true);
	
}

	private Object[][] cadastrado() {
		PessoaDAO pessoa=new PessoaDAO();
		ArrayList<Pessoa>cadastros=new ArrayList<Pessoa>();
		cadastros=pessoa.listar();
		
	
		Object[][] dados=new Object[cadastros.size()][31];
		for(int i=0;i<cadastros.size();i++) {
			for(int j=0;j<31;j++) {
				dados[i][j]="Nome:"+" "+cadastros.get(i).getNome()+";"+" "+"Jogos Quartas de Final="+"["+cadastros.get(i).getSelecoesQuarta().get(0)+";"+cadastros.get(i).getPlacaresQuarta().get(0)+" "+"x"+" "+
						cadastros.get(i).getSelecoesQuarta().get(1)+";"+cadastros.get(i).getPlacaresQuarta().get(1)+"]" +" "+ "["+
						cadastros.get(i).getSelecoesQuarta().get(2)+";"+cadastros.get(i).getPlacaresQuarta().get(2)+" "+"x"+" "+
						cadastros.get(i).getSelecoesQuarta().get(3)+";"+cadastros.get(i).getPlacaresQuarta().get(3)+"]"+" "+"["+
						cadastros.get(i).getSelecoesQuarta().get(4)+";"+cadastros.get(i).getPlacaresQuarta().get(4)+" "+"x"+" "+
						cadastros.get(i).getSelecoesQuarta().get(5)+";"+cadastros.get(i).getPlacaresQuarta().get(5)+"]"+" "+"["+
						cadastros.get(i).getSelecoesQuarta().get(6)+";"+cadastros.get(i).getPlacaresQuarta().get(6)+" "+"x"+" "+
						cadastros.get(i).getSelecoesQuarta().get(7)+";"+cadastros.get(i).getPlacaresQuarta().get(7)+"]"+" "+
						" Jogos SemiFinal="+"["+
						cadastros.get(i).getSelecoesSemi().get(0)+";"+cadastros.get(i).getPlacaresSemi().get(0)+" "+"x"+" "+
						cadastros.get(i).getSelecoesSemi().get(1)+";"+cadastros.get(i).getPlacaresSemi().get(1)+"]"+" "+"["+
						cadastros.get(i).getSelecoesSemi().get(2)+";"+cadastros.get(i).getPlacaresSemi().get(2)+" "+"x"+" "+
						cadastros.get(i).getSelecoesSemi().get(3)+";"+cadastros.get(i).getPlacaresSemi().get(3)+"]"+" "+
						"Jogos Final="+ "["+
						cadastros.get(i).getSelecoesFinal().get(0)+";"+cadastros.get(i).getPlacaresFinal().get(0)+" "+"x"+" "+
						cadastros.get(i).getSelecoesFinal().get(1)+";"+cadastros.get(i).getPlacaresFinal().get(1)+"]"+" "+
						"Campeão="+
						cadastros.get(i).getCampeao();
			}
		}
		
		
		return dados;
	}}
