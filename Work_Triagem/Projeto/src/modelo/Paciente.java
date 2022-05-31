package modelo;

public class Paciente {

	String nome;
	String data;
	String horario;
	String medico;
	String diagnostico;
	String recomendacao;

	
	public Paciente(String nome, String data, String horario, String medico, String diagnostico, String recomendacao) {

		this.nome = nome;
		this.data = data;
		this.horario = horario;
		this.medico = medico;
		this.diagnostico = diagnostico;
		this.recomendacao = recomendacao;
	}

	public Paciente(String linha) {

		this.nome = linha.split(";")[0];
		this.data = linha.split(";")[1];
		this.horario = linha.split(";")[2];
		this.medico = linha.split(";")[3];
		this.diagnostico = linha.split(";")[4];
		this.recomendacao = linha.split(";")[5];
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public String getMedico() {
		return medico;
	}

	public void setMedico(String medico) {
		this.medico = medico;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public String getRecomendacao() {
		return recomendacao;
	}

	public void setRecomendacao(String recomendacao) {
		this.recomendacao = recomendacao;
	}

	public String toString() {
		return "nome:" + nome + "\ndata:" + data + "\nhorario:" + horario + "\nmedico:" + medico
				+ "\ndiagnostico:" + diagnostico + "\nrecomendacao:" + recomendacao +"\n";
	}

	public String toCSV() {
		return nome + ";" + data + ";" + horario + ";" + medico + ";" + diagnostico + ";" + recomendacao;
	}

}