package Shapes;

public class Trapezoid implements IrregularPolygon {

	@Override
	public void showInfo() {
		System.out.println(getInfo());
	}

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return "Polygon: Trapezoid\nFactory: 4 Sides\nCategory: Irregular Polygon";
	}

}
