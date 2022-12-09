package apresentacao;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;

import negocio.Cadastros;
import negocio.EscreverBolao;
import negocio.EscreverNome;
import negocio.FrameQuartas;
import negocio.LerBolao;
import negocio.Pessoa;

public class Apresentacao extends JFrame {
	
	public Apresentacao() {
		setSize(350,350);
		setTitle("MENU");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		organizar();
		setVisible(true);
	}

	private void organizar() {
		setLayout(new GridLayout(4,1));
		JButton cadastro=new JButton();
		cadastro.setText("CADASTRAR NOVO BOLÃO");
		cadastro.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				Pessoa p=new Pessoa();
				 
				FrameQuartas j=new FrameQuartas();
				EscreverNome en=new EscreverNome(j,p);
			}
		});
		add(cadastro);
		JButton mostrar=new JButton();
		mostrar.setText("MOSTRAR BOLÕES CADASTRADOS");
		mostrar.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				Cadastros c=new Cadastros();
			}
		});
		add(mostrar);
		JButton exportar=new JButton();
		exportar.setText("EXPORTAR BOLÕES");
		exportar.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
			
				EscreverBolao escrever=new EscreverBolao();
				File meuArquivo=new File("bolao1.txt");
				escrever.escrever(escrever.boloesEscritos(), meuArquivo);
				
			}
		});
		add(exportar);
		JButton importar=new JButton();
		importar.setText("IMPORTAR BOLÕES");
		importar.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
			
				JFileChooser chooser = new JFileChooser();
			    FileNameExtensionFilter filter = new FileNameExtensionFilter(
			        "JPG & GIF Images", "jpg", "gif");
			    chooser.setFileFilter(filter);
			   
			    int returnVal = chooser.showOpenDialog(null);
			    
			   
			  
			    LerBolao leitura=new LerBolao();
			   leitura.ler(chooser.getSelectedFile());
				
			}
		});
		add(importar);
	}
	
	
}
