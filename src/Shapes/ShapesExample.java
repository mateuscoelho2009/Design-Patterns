package Shapes;

public class ShapesExample {

	public void run() {
		ShapesFactory sf = new FourSidesPolygon();
		
		IrregularPolygon ip = sf.CreateIrregularPolygon();
		ip.showInfo();
		
		RegularPolygon rp = sf.CreateRegularPolygon();
		rp.showInfo();
	}
	
}
