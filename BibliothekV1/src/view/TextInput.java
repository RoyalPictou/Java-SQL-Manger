package view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class TextInput extends JPanel {

	private static final long serialVersionUID = 1L;
	private Label m_Label;
	private Textfield m_TextField;
	public TextInput(String label,int textfieldChars) {
		m_Label = new Label(label);
		m_TextField = new Textfield(textfieldChars);
		m_Label.setBackground(Color.RED);
		m_Label.setOpaque(true);
		//m_TextField.setBackground(Color.blue);
		setLayout(new GridLayout(2,1));
		add(m_Label);
		add(m_TextField);
	}
	

}
