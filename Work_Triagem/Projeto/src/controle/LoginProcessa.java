package controle;

import java.util.ArrayList;

import modelo.Funcionario;
//import uteis.Cripto;
import modelo.modelodao.FuncionariosDAO;

public class LoginProcessa {
	
	public static ArrayList<Funcionario> funcionarios = new ArrayList<>();
	public static String LoginUsusarioConectado;
	private static FuncionariosDAO fd = new FuncionariosDAO();

	public static void abrir() {
		funcionarios = fd.ler();
		if(funcionarios.size() == 0) {
			funcionarios.add(new Funcionario("admin",("admin")));
		}
	}

	public static void salvar() {
		fd.escrever(funcionarios);
	}
	
	public static int checarLogin(String email) {
		int retorno = -1;
		for (int i = 0; i < funcionarios.size(); i++) {
			if (funcionarios.get(i).getLogin().equals(email)) {
				return i;
			}
		}
		return retorno;
	}

	public static boolean checarSenha(int indice, String senha) {
		if (funcionarios.get(indice).getSenha().equals(senha)) {
			LoginUsusarioConectado = funcionarios.get(indice).getLogin();
			return true;
		}
		return false;
	}
}