package structurals.adapter;

public interface Shape {
	public void BoundingBox(Point bottomLeft, Point topRight);
	public Manipulator CreateManipulator();
}
