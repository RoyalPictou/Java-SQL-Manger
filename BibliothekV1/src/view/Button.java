package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JButton;

public class Button extends JButton{

	public Button() {
		// TODO Auto-generated constructor stub
	}

	public Button(Icon icon) {
		super(icon);
		// TODO Auto-generated constructor stub
	}

	public Button(String text) {
		super(text);
		setSize(80,20);
		// TODO Auto-generated constructor stub
	}

	public Button(Action a) {
		super(a);
		// TODO Auto-generated constructor stub
	}

	public Button(String text, Icon icon) {
		super(text, icon);
		// TODO Auto-generated constructor stub
	}

}
