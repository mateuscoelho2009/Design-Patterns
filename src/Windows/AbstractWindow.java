package Windows;

public abstract class AbstractWindow {
	ImplementedWindow impWindow;
	
	public AbstractWindow (ImplementedWindow iw) {
		impWindow = iw;
	}
	
	public void DrawWindow(String title) {
		impWindow.DrawWindow(title);
	}

	public void DrawButtom(String buttom) {
		impWindow.DrawButtom(buttom);
	}

	public void DrawShapes(String shapes) {
		impWindow.DrawShapes(shapes);
	}
	
	public abstract void Draw ();
}
