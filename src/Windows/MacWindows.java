package Windows;

public class MacWindows implements ImplementedWindow {

	@Override
	public void DrawWindow(String title) {
		System.out.println(title + " - Mac's Window.");
	}

	@Override
	public void DrawButtom(String buttom) {
		System.out.println(buttom + " - Mac's Buttom.");
	}

	@Override
	public void DrawShapes(String shapes) {
		System.out.println(shapes + " - Mac's Shape.");
	}

}
