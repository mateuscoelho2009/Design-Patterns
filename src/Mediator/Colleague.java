package Mediator;

public abstract class Colleague {
    protected Mediator mediator;
 
    public Colleague(Mediator m) {
        mediator = m;
    }
 
    public void SendMessage(String message) {
        mediator.Send(message, this);
    }
 
    public abstract void ReceiveMessage (String message);
}