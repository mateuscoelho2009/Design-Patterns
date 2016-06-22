package Windows;

public class ErrorMessage extends AbstractWindow {
	public ErrorMessage (ImplementedWindow iw) {
		// TODO Auto-generated constructor stub
		super (iw);
	}
	
	@Override
	public void Draw() {
		DrawWindow("Error Window!!!");
		DrawButtom("OK, I'll fix it.");
	}

}
