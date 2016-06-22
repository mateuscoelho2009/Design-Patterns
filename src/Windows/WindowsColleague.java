package Windows;

import Mediator.Colleague;
import Mediator.Mediator;

public class WindowsColleague extends Colleague {
	public WindowsColleague(Mediator m) {
        super(m);
    }
 
    @Override
    public void ReceiveMessage(String message) {
        System.out.println("The window received: " + message);
    }
}
