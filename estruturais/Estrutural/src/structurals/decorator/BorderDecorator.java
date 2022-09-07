package structurals.decorator;

public class BorderDecorator extends Decorator{

	private int _width;
	
	public BorderDecorator(VisualComponent _component, int borderWidth) {
		super(_component);
		this._width = borderWidth;
	}
	
	@Override
	public void Draw() {
		super.Draw();
		DrawBorder(_width);
	}

	private void DrawBorder(int _width2) {
		// .. implementation
	}

}
