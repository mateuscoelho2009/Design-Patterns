package Windows;

import Shapes.FourSidesPolygon;
import Shapes.ShapesFactory;

public class WindowExample {
	public void run() {
		AbstractWindow w = new DialogWindow(new MacWindows());
		w.Draw();
		
		w = new ErrorMessage (new WindowsWindow());
		w.Draw();
		
		ShapesFactory sf = new FourSidesPolygon();
		
		w = new DrawingWindow(new LinuxWindow(), sf.CreateRegularPolygon());
		w.Draw();
	}
}
