package Windows;

public class WindowsWindow implements ImplementedWindow {

	@Override
	public void DrawWindow(String title) {
		System.out.println(title + " - Windows' Window.");
	}

	@Override
	public void DrawButtom(String buttom) {
		System.out.println(buttom + " - Windows' Buttom.");
	}

	@Override
	public void DrawShapes(String shapes) {
		System.out.println(shapes + " - Windows' Shape.");
	}

}
