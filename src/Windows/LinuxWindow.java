package Windows;

public class LinuxWindow implements ImplementedWindow {

	@Override
	public void DrawWindow(String title) {
		System.out.println(title + " - Linux's Window.");
	}

	@Override
	public void DrawButtom(String buttom) {
		System.out.println(buttom + " - Linux's Buttom.");
	}

	@Override
	public void DrawShapes(String shapes) {
		System.out.println(shapes + " - Linux's Shape.");
	}

}
