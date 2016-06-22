package Shapes;

public class FourSidesPolygon implements ShapesFactory {

	@Override
	public RegularPolygon CreateRegularPolygon() {
		return new Square();
	}

	@Override
	public IrregularPolygon CreateIrregularPolygon() {
		return new Trapezoid();
	}

}
