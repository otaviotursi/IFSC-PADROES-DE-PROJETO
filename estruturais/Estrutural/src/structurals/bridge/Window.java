package structurals.bridge;

import structurals.adapter.Point;

public class Window {
	private WindowImp _imp;
	private View _contents;

	protected WindowImp GetWindowImp() {
		return _imp;
	}

	protected View GetView() {
		return _contents;
	}

	void DrawRect(Point p1, Point p2) {
		WindowImp imp = GetWindowImp();
		imp.DeviceRect(p1.X(), p1.Y(), p2.X(), p2.Y());
	}

	// Other methods
}
