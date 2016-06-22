package Mediator;

import java.util.ArrayList;

import Mediator.Colleague;
import Mediator.Mediator;
import Shapes.ShapesColleague;
import Windows.WindowsColleague;

public class MessageMediator implements Mediator {
	
	protected ArrayList<Colleague> contacts;
	
	public MessageMediator() {
		contacts = new ArrayList<Colleague>();
	}
	 
	public void adicionarColleague(Colleague colleague) {
	    contacts.add(colleague);
	}
	 
	@Override
	public void Send (String message, Colleague colleague) {
	    for (Colleague contact : contacts) {
	        if (contact != colleague) {
	            defineProtocol(contact);
	            contact.ReceiveMessage(message);
	        }
	    }
	}
	 
	private void defineProtocol(Colleague contact) {
	    if (contact instanceof ShapesColleague) {
	        System.out.println("Shapes Protocol");
	    } else if (contact instanceof WindowsColleague) {
	        System.out.println("Windows Protocol");
	    }
	}

}