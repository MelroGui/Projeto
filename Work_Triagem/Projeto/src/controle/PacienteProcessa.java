package controle;

import java.util.ArrayList;

import modelo.Paciente;
import modelo.modelodao.PacienteDAO;

public class PacienteProcessa {

	public static ArrayList<Paciente> paciente = new ArrayList<>();
	public static PacienteDAO pd = new PacienteDAO();

	public static void salvar() {
		pd.escrever(paciente);
	}

	public static void abrir() {
		paciente = pd.ler();

	}
}