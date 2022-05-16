package view;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JPanel;

public class Window extends JPanel implements ActionListener{

	private ArrayList<Button> m_Buttons;
	private ArrayList<Textfield> m_Textfields;
	private ArrayList<TextInput> m_TextInputs;
	private Print m_Debug;
	public Window() {
		super();
		setLayout(new GridLayout(4,2));
		m_Buttons = new ArrayList<Button>();
		m_Textfields = new ArrayList<Textfield>();
		m_TextInputs = new ArrayList<TextInput>();
		m_Debug = new Print("Debug");
		
		TextInput feld1 = new TextInput("Name",40);
		TextInput feld2 = new TextInput("Alter",40);
		TextInput feld3 = new TextInput("Nationalität",40);
		TextInput feld4 = new TextInput("Werdegang",40);
		add(feld1);
		add(feld2);
		add(feld3);
		add(feld4);
		Button saveButton = new Button("Speichern");
		add(saveButton);
		m_Buttons.add(saveButton);
		Label error = new Label("Fehlermeldungen");
		add(error);
		//Textfield inputField = new Textfield(60);
		//m_Textfields.add(inputField);
		//add(inputField);
		//saveButton.addActionListener(this);
		
		// TODO Auto-generated constructor stub
	}
	public void gatherData()
	{
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		int id = e.getID();
		m_Debug.println(m_Textfields.get(0).getText());
		//m_Debug.println("ID: " + id + "ObjectName: "+ obj.toString());
		
	}
	
/*
	public Window(LayoutManager layout) {
		super(layout);
		// TODO Auto-generated constructor stub
	}

	public Window(boolean isDoubleBuffered) {
		super(isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

	public Window(LayoutManager layout, boolean isDoubleBuffered) {
		super(layout, isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}
*/
}
