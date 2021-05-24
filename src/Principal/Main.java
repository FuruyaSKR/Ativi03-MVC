package Principal;

import java.util.Calendar;

import Persistencia.*;

public class Main {

	public static void main(String[] args) {
		
		Aluno a = new Aluno("R0UzFhHimN", "745.212.401-43", "igorraimundodepaula_@riguetti.com.br", Calendar.getInstance());
		
		AlunoCSV a_csv = new AlunoCSV();
		AlunoPersist persist = new AlunoPersist(a_csv);
		persist.gravar(a);
		/*
		AlunoJSON a_json = new AlunoJSON();
		persist = new AlunoPersist(a_json);
		persist.gravar(a);
		*/
		
	}
}
