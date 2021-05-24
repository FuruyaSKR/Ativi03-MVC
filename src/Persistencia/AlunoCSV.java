package Persistencia;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import Principal.Aluno;

public class AlunoCSV implements IAlunoPersist {

	public void gravar(Aluno a) {
		FileWriter arq;
		PrintWriter gravarArq;
		try {
			arq = new FileWriter("aluno.csv");
			gravarArq = new PrintWriter(arq);
			gravarArq.printf("%s;%s;%s;%s;%s;\n"
					, a.getNome()
					, a.getCpf()
					, a.getEmail()
					, a.getMatricula()
					, a.getDataNascimento());
			arq.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
