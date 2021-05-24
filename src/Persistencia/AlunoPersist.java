package Persistencia;

import Principal.Aluno;

public class AlunoPersist {

	private IAlunoPersist persist;
	
	public AlunoPersist(IAlunoPersist persist) {
		this.persist = persist;
	}
	
	public void gravar(Aluno a) {
		persist.gravar(a);
	}
}
