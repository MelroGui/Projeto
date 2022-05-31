package telas;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import controle.PacienteProcessa;

import modelo.Paciente;

public class TelaMedico extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel painel;
	private JLabel nome, data, horario, medico, diagnostico, recomendacao, rotulos;
	private JTextField tfnome, tfdata, tfhorario, tfmedico, tfdiagnostico, tfrecomendacao;
	private JScrollPane rolagem;
	private JTextArea verResultados;
	private JButton read;
	private String imgIco = "";
	private String texto = "";

	public TelaMedico() {
		setTitle("Consultas");
		setBounds(100, 100, 800, 600);
		setIconImage(new ImageIcon(imgIco).getImage());
		painel = new JPanel();
		painel.setBackground(new Color(0, 255, 127));
		setContentPane(painel);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);

		nome = new JLabel("nome:");
		nome.setBounds(20, 20, 120, 30);
		painel.add(nome);
		data = new JLabel("data:");
		data.setBounds(20, 55, 120, 30);
		painel.add(data);
		horario = new JLabel("horario:");
		horario.setBounds(20, 90, 120, 30);
		painel.add(horario);
		medico = new JLabel("medico:");
		medico.setBounds(20, 125, 120, 30);
		painel.add(medico);

		diagnostico = new JLabel("diagnostico:");
		diagnostico.setBounds(20, 165, 120, 30);
		painel.add(diagnostico);

		recomendacao = new JLabel("recomendacao:");
		recomendacao.setBounds(20, 205, 120, 30);
		painel.add(diagnostico);

		rotulos = new JLabel("agenda:");
		rotulos.setBounds(20, 310, 500, 30);
		painel.add(rotulos);

		tfnome = new JTextField();
		tfnome.setBounds(140, 25, 255, 30);
		painel.add(tfnome);

		tfdata = new JTextField();
		tfdata.setBounds(140, 60, 80, 30);
		painel.add(tfdata);

		tfhorario = new JTextField();
		tfhorario.setBounds(140, 92, 80, 30);
		painel.add(tfhorario);

		tfmedico = new JTextField();
		tfmedico.setBounds(140, 125, 255, 30);
		painel.add(tfmedico);

		tfdiagnostico = new JTextField();
		tfdiagnostico.setBounds(140, 165, 255, 30);
		painel.add(tfdiagnostico);

		tfrecomendacao = new JTextField();
		tfrecomendacao.setBounds(140, 205, 255, 30);
		painel.add(tfrecomendacao);

		verResultados = new JTextArea();
		verResultados.setEditable(false);
		verResultados.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));

		preencherAreaDeTexto();
		rolagem = new JScrollPane(verResultados);
		rolagem.setBounds(20, 340, 740, 200);
		painel.add(rolagem);

		read = new JButton("Buscar");

		read.setBounds(405, 25, 110, 30);

		painel.add(read);

		read.addActionListener(this);

	}
	private void preencherAreaDeTexto() {
		texto = ""; 
		for (Paciente p : PacienteProcessa.paciente) {
			texto += p.toString();
		}
		verResultados.setText(texto);
	}

	public static void main(String[] agrs) throws ParseException {
		PacienteProcessa.abrir();

		new TelaMedico().setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
	public void setModal(boolean b) {
		
	}
}