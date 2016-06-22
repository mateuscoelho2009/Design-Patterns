import Mediator.MediatorExample;
import Shapes.ShapesExample;
import Windows.WindowExample;



public class mainClass {

	public static void main(String[] args) {
		WindowExample we = new WindowExample();
		we.run();
		
		System.out.println("-----------------------");
		
		ShapesExample se = new ShapesExample();
		se.run();

		System.out.println("-----------------------");

		MediatorExample me = new MediatorExample();
		me.run();
	}

}
