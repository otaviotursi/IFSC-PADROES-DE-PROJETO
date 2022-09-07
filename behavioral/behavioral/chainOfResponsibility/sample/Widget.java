package behavioral.chainOfResponsibility.sample;

public class Widget extends HelperHandler{
	private Widget _parent;

	public Widget(Widget _parent, Topic _topic) {
		super(_parent, _topic);
		this._parent = _parent;
	}
}
