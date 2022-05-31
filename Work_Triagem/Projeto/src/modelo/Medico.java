package modelo;

import java.util.Objects;

public class Medico {

	private String email;
	private String senha;
	
	public Medico(String email,String senha) {
		this.email = email;
		this.senha = senha;
	}
	
	public Medico(String linha) {
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

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Medico other = (Medico) obj;
		return Objects.equals(email, other.email) && Objects.equals(senha, other.senha);
	}

	public String toString() {
		return  email + "\t" + senha;
	}
	
	public String toCSV() {
		return email +";" + senha + "\r\n";
	}	
}