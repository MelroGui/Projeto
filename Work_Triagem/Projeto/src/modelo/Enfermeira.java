package modelo;

import java.util.Objects;

public class Enfermeira {

	private String email;
	private String senha;
	
	public Enfermeira(String email,String senha) {
		this.email = email;
		this.senha = senha;
	}
	
	public Enfermeira(String linha) {
		this.email = linha.split(":")[0];
		this.senha = linha.split(";")[1];
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int hashCode() {
		return Objects.hash(email);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Enfermeira other = (Enfermeira) obj;
		return Objects.equals(email, other.email) && Objects.equals(senha, other.senha);
	}

	@Override
	public String toString() {
		return  email + "\t" + senha;
	}
	
	public String toCSV() {
		return email +";" + senha + "\r\n";
	}
	
	
	
}