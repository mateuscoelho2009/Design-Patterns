package Windows;

public class DrawingWindow extends AbstractWindow {
	public DrawingWindow (ImplementedWindow iw) {
		// TODO Auto-generated constructor stub
		super (iw);
	}
	
	@Override
	public void Draw() {
		DrawWindow ("Drawing Window");
		DrawShapes ("Square");
		DrawShapes ("Circle");
		DrawShapes ("Triangle");
	}
}
