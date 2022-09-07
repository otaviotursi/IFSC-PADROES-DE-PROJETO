
public class LineAdapterObject implements Shape{
	private Line line;
	
	public void draw(int x1, int y1, int x2, int y2) {
		this.line.drawLine(x1, y1, x2, y2);
	}
	
}
