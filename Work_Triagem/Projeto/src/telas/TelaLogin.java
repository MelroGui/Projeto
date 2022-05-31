package telas;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import controle.LoginProcessa;
import controle.PacienteProcessa;

public class TelaLogin extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	private JPanel painel;
	private JLabel rotulo1, rotulo2;
	private JTextField tfLogin;
	private JPasswordField senha;
	private JButton login;
	private String imgIco = "./assets/key.png";

	TelaLogin() {

		setTitle("Tela de Login");
		setIconImage(new ImageIcon(imgIco).getImage());
		setBounds(400, 200, 420, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		painel = new JPanel(); 
		painel.setBackground(new Color(176,224,230));
		setContentPane(painel);
		setLayout(null);

		rotulo1 = new JLabel("Login:");
		rotulo1.setBounds(20, 70, 100, 20);
		tfLogin = new JTextField();
		tfLogin.setBounds(120, 70, 200, 30);
		rotulo2 = new JLabel("Senha:");
		rotulo2.setBounds(20, 110, 100, 20);
		senha = new JPasswordField();
		senha.setEchoChar('*');
		senha.setBounds(120, 110, 200, 30);
		login = new JButton("Login");
		login.setBounds(120, 150, 200, 30);
		
		login.addActionListener(this);

		painel.add(rotulo1);
		painel.add(tfLogin);
		painel.add(rotulo2);
		painel.add(senha);
		painel.add(login);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == login) {
			if (tfLogin.getText().length() > 0 && new String(senha.getPassword()).length() > 0) {
				int indice = LoginProcessa.checarLogin(tfLogin.getText());
				if (indice != -1) {
						this.dispose();
						TelaMenu tl = new TelaMenu();
						tl.setVisible(true);
					} else {
						JOptionPane.showMessageDialog(this, "Acesso negado");
					}
				} else {
					JOptionPane.showMessageDialog(this, "Usuário não encontrado");
				}
			} else {
				JOptionPane.showMessageDialog(this, "Preencha o login e a senha");
			}
		}

	public static void main(String[] args) {
		LoginProcessa.abrir();
		PacienteProcessa.abrir();
		TelaLogin login = new TelaLogin();
		login.setVisible(true);
	}
}