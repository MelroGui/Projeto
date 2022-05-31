package modelo.modelodao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import modelo.Paciente;

public class PacienteDAO {

	private BufferedReader br;
	private BufferedWriter bw;
	private String path = ".//data//pacientes.csv";

	public ArrayList<Paciente> ler() {
		ArrayList<Paciente> linhas = new ArrayList<>();
		Paciente p;
		try {
			br = new BufferedReader(new FileReader(path));
			String linha = br.readLine();
			while (linha != null) {
				p = new Paciente(linha);
				linhas.add(p);
				linha = br.readLine();
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
		return linhas;
	}

	public void escrever(ArrayList<Paciente> linhas) {
		try {
			bw = new BufferedWriter(new FileWriter(path));
			for (Paciente p : linhas) {
				bw.write(p.toCSV());
			}
			bw.close();
		} catch (IOException e) {
			System.out.println(e);
		}

	}

}