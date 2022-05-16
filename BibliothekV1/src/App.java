import java.awt.Dimension;

import javax.swing.JFrame;

import view.Window;

public class App extends JFrame{

	public App(String name,Dimension dim) {
		super(name);
		setSize(dim);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Window mainWindow = new Window();
		add(mainWindow);
		setVisible(true);
	}

	public static void main(String[] args) {
		App application = new App("Bibliothek", new Dimension( 800 ,600));
		//application.Init();

	}
}
