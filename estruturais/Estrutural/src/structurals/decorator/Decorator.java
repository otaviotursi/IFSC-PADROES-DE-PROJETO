package structurals.decorator;

public class Decorator extends VisualComponent{

	private VisualComponent _component;
	
	public Decorator(VisualComponent _component) {
		this._component = _component;
	}

	@Override
	public void Draw() {
		_component.Draw();
	}

	@Override
	public void Resize() {
		_component.Resize();
	}
}
