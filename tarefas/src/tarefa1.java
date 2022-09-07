

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class tarefa1 {
	JLabel label;
	JButton button;
	JTextField textField;
	
	public tarefa1() {
		JFrame frame = new JFrame("Título da tela");
		frame.setVisible(true);
		frame.setSize(300, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		
		
		label = new JLabel("TEXTO");
		frame.add(label);
		
		button = new JButton("Botao");
		button.addActionListener(this);
		
		frame.add(button);
		
		textField = new JTextField(10);
		frame.add(textField);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override 
			public void run() {
				new tarefa1();
			}
		});
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		var teste = e.getActionCommand();
		System.out.println(teste);
		label.setText(textField.getText());
		textField.setText(""); 
	}
}
