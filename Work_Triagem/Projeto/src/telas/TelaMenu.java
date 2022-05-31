package telas;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import controle.LoginProcessa;
import controle.PacienteProcessa;

public class TelaMenu extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel painel;
	private JButton TMedico, TPaciente;

	TelaMenu() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Acesso dos Funcionarios");
		setBounds(100, 100, 400, 400);
		painel = new JPanel();
		painel.setBackground(new Color(255, 233, 213));
		setContentPane(painel);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);

		TMedico = new JButton("Medico");
		TMedico.setBounds(100, 100, 200, 30);
		TPaciente = new JButton("Recepção");
		TPaciente.setBounds(100, 150, 200, 30);
		
		TMedico.addActionListener(this);
		TPaciente.addActionListener(this);

		painel.add(TMedico);
		painel.add(TPaciente);
	}

	@Override
	public void actionPerformed(ActionEvent m) {
		if (m.getSource() == TMedico) {
			this.dispose();
			TelaMedico tm = new TelaMedico();
			tm.setVisible(true);
	}
}
	public void actionPerformed1(ActionEvent p) {
		if (p.getSource() == TPaciente) {
			this.dispose();
			TelaPaciente tp = new TelaPaciente();
			tp.setVisible(true);
	}
}

	public static void main(String[] args) {
		LoginProcessa.abrir();
		PacienteProcessa.abrir();
		TelaLogin login = new TelaLogin();
		login.setVisible(true);
	}
}