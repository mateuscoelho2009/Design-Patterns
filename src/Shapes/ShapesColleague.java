package Shapes;

import Mediator.Colleague;
import Mediator.Mediator;

public class ShapesColleague extends Colleague {
	public ShapesColleague(Mediator m) {
        super(m);
    }
 
    @Override
    public void ReceiveMessage(String message) {
        System.out.println("The shape received: " + message);
    }
}
