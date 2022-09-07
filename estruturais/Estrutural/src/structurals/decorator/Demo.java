package structurals.decorator;

public class Demo {

	public static void main(String[] args) {
	
		VisualComponent decoratedTextView = 
				new BorderDecorator(
						new ScrollDecorator(
								new TextView()), 1);
	}

}
