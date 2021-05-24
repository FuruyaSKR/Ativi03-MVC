package Persistencia;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
 
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.output.XMLOutputter;

import Principal.Aluno;

public class AlunoXML implements IAlunoPersist {

	private Element config = new Element("Persistencia");

	public void gravar(Aluno a) {
		Document documento = new Document(config);
			
		Element titulo = new Element("titulo");
		titulo.setText("Persistencia");
		config.addContent(titulo);

		Element dados = new Element("Dados");
		Element nome = new Element("Nome");
		nome.setText(a.getNome());
		dados.addContent(nome);
		
		Element cpf = new Element("CPF");
		cpf.setText(a.getCpf());
		dados.addContent(cpf);
		
		Element email = new Element("E-Mail");
		email.setText(a.getEmail());
		dados.addContent(email);
		
		Element matri = new Element("Matricula");
		matri.setText(a.getMatricula());
		dados.addContent(matri);
		
		config.addContent(dados);
		XMLOutputter xout = new XMLOutputter();
		
		try {
			BufferedWriter arquivo = new BufferedWriter(
				    new OutputStreamWriter(new FileOutputStream("aluno.xml"), "UTF-8"));
		xout.output(documento, arquivo);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
