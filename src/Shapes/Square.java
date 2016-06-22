package Shapes;

public class Square implements RegularPolygon {

	@Override
	public void showInfo() {
		System.out.println(getInfo());
	}

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return "Polygon: Square\nFactory: 4 Sides\nCategory: Regular Polygon";
	}
}
