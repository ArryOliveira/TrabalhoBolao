package negocio;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Objects;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import persistencia.Conexao;
import persistencia.PessoaDAO;

public class FrameFinal extends JFrame implements ActionListener {
	public Final f;
	public Pessoa pessoa;
	public Campeao campeao;
	public FrameFinal(String vetor[]) {
		f=new Final(vetor);
		setSize(350,350);
		setTitle("Final");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		organizar();
		setVisible(false);
		pack();
	}
	
	private void organizar() {
		setLayout(new BorderLayout());
		add(f,BorderLayout.CENTER);
		JButton Botao=new JButton();
		Botao.setText("ENVIAR");
		add(Botao,BorderLayout.SOUTH);
		Botao.addActionListener(this);
		
	}

	public void actionPerformed(ActionEvent e) {
	
	JTextField aux[]=f.placares;
	String auxGanhador=Compara(f.selecoes.get(0),f.selecoes.get(1),Integer.parseInt(aux[0].getText()),Integer.parseInt(aux[1].getText()));
	
	
	pessoa.setSelecoesFinal(f.selecoes);
	pessoa.setPlacaresFinal(f.PlacaresFinal(f.placares));
	pessoa.setCampeao(auxGanhador);
	
	campeao=new Campeao(SetaBandeira(auxGanhador));
	campeao.pessoa=pessoa;
	campeao.setVisible(true);
	
	PessoaDAO x=new PessoaDAO();
	x.inserir(pessoa);
	
	
	
	
	
	
	this.setVisible(false);
	
	
		
	}
	
	public String Compara(String s1, String s2, Integer p1, Integer p2) {
		int placar1=p1;
		int placar2=p2;
		String ganhador=null;
		if(placar2>placar1) {
			ganhador=s2;
		}
		else {
			ganhador=s1;
		}
		return ganhador;
	}
	public ImageIcon SetaBandeira(String nome) {
		ImageIcon imagem=null;
		if(nome.equals("bra")) {
			 imagem=new ImageIcon(Objects.requireNonNull(getClass().getResource("/images/brazil.png")));
		}
		if(nome.equals("fra")) {
			 imagem=new ImageIcon(Objects.requireNonNull(getClass().getResource("/images/frança.png")));
		}
		if(nome.equals("eua")) {
			 imagem=new ImageIcon(Objects.requireNonNull(getClass().getResource("/images/eua.png")));
		}
		if(nome.equals("hol")) {
			 imagem=new ImageIcon(Objects.requireNonNull(getClass().getResource("/images/holanda.png")));
		}
		if(nome.equals("ing")) {
			 imagem=new ImageIcon(Objects.requireNonNull(getClass().getResource("/images/inglaterra.png")));
		}
		if(nome.equals("mar")) {
			 imagem=new ImageIcon(Objects.requireNonNull(getClass().getResource("/images/marrocos.png")));
		}
		if(nome.equals("por")) {
			 imagem=new ImageIcon(Objects.requireNonNull(getClass().getResource("/images/portugal.png")));
		}
		if(nome.equals("arg")) {
			 imagem=new ImageIcon(Objects.requireNonNull(getClass().getResource("/images/argentina.png")));
		}
		return imagem;
	}
	
}
