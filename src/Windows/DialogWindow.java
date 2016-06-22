package Windows;

public class DialogWindow extends AbstractWindow {

	public DialogWindow (ImplementedWindow iw) {
		super(iw);
	}
	
	@Override
	public void Draw() {
		DrawWindow("Dialog Window");
		DrawButtom("Yes");
		DrawButtom("No");
		DrawButtom("Cancel");
	}

}
