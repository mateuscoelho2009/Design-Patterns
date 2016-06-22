package Windows;

import Mediator.Mediator;
import Mediator.MessageMediator;
import Shapes.RegularPolygon;
import Shapes.ShapesColleague;

public class DrawingWindow extends AbstractWindow {
	RegularPolygon rPolygon;
	
	public DrawingWindow (ImplementedWindow iw, RegularPolygon rp) {
		// TODO Auto-generated constructor stub
		super (iw);
		
		rPolygon = rp;
	}
	
	@Override
	public void Draw() {
		DrawWindow ("Drawing Window");
		DrawShapes (null);
	}
	
	@Override
	public void DrawShapes (String s) {
		MessageMediator mediator = new MessageMediator();
		 
	    ShapesColleague shape = new ShapesColleague(mediator);
	    WindowsColleague window = new WindowsColleague(mediator);
	    
	    mediator.adicionarColleague(shape);
	    mediator.adicionarColleague(window);
	    
	    shape.SendMessage("\n" + rPolygon.getInfo());
	    System.out.println("");
	}
}
