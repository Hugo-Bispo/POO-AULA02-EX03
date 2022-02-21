package controller;

public class Recursiva_infinita {
	String text = "Heap ";
	public void Estouro_stack() {
		if (text == "Stack") {
			System.exit(0);
		} else {
			text += text;
			Estouro_stack();
		}
	}
}
