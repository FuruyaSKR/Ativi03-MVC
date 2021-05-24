package Principal;

import java.util.Calendar;

public class Aluno extends Pessoa {

	private String matricula;
	private String cpf;
	private String email;
	private Calendar dataNascimento;
	
	public Aluno(String matricula, String cpf,String email, Calendar dataNascimento) {
		super();
		this.matricula = matricula;
		this.cpf = cpf;
		this.email = email;
		this.dataNascimento = dataNascimento;
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		if (cpf.length() > 0) {
			this.cpf = cpf;
		}
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		if (email.length() > 0) {
			this.email = email;
		}
	}
	
	public Calendar getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento(Calendar dataNascimento) {
		if (dataNascimento != null) {
			this.dataNascimento = dataNascimento;
		}
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Aluno [matricula=");
		builder.append(matricula);
		builder.append(", cpf=");
		builder.append(cpf);
		builder.append(", email=");
		builder.append(email);
		builder.append(", dataNascimento=");
		builder.append(dataNascimento);
		builder.append("]");
		return builder.toString();
	}
	
}
