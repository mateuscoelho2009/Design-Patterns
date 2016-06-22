package Mediator;

import Shapes.ShapesColleague;
import Windows.WindowsColleague;

public class MediatorExample {
	public void run() {
		MessageMediator mediator = new MessageMediator();
		 
	    ShapesColleague shape = new ShapesColleague(mediator);
	    WindowsColleague window = new WindowsColleague(mediator);
	 
	    mediator.adicionarColleague(shape);
	    mediator.adicionarColleague(window);
	    
	    shape.SendMessage("Hi, I'm a shape.");
	    System.out.println("=========");
	    window.SendMessage("Hi, I'm a Window.");
	}
}
