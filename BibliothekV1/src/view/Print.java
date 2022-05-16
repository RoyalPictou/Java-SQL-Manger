package view;

public class Print {
private int lineCounter;
private String objName;
	public Print(String name, String message) {
		Init(name);
		
		println(message);
	}
	public Print(String name) {
		Init(name);
	}
	public void Init(String name) {
		lineCounter = 0;
		objName = name;
	}
	void println(String message)
	{
		System.out.println(lineCounter + " " + objName +": "+message);
		lineCounter++;
	}

}
