package Windows;

public class WindowExample {
	public void run() {
		AbstractWindow w = new DialogWindow(new MacWindows());
		w.Draw();
		
		w = new ErrorMessage (new WindowsWindow());
		w.Draw();
		
		w = new DrawingWindow(new LinuxWindow());
		w.Draw();
	}
}
