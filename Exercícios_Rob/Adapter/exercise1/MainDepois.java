package structurals.adapter.exercise1;

import java.util.ArrayList;
import java.util.List;

public class MainDepois {
	public static void main(String[] args) {

		// Shape representa a interface (tipo) utilizada
		List<Shape> shapes = new ArrayList<Shape>();
		
		// (Criar) LineAdapterClass adapta a classe Line para
		// a Interface definida em Shape
		shapes.add(new LineAdapterClass());
		// (Criar) RectangleAdapterClass adapta a classe Rectangle para
		// a Interface definida em Shape
		shapes.add(new RectangleAdapterClass());
		
		// Obs. 1: nao alterar as classes Line e Rectangle
        // Obs. 2: eh de livre escolha a utilizacao de
		// Object Adapter ou Class Adapter
		int x1 = 10, y1 = 20;
		int x2 = 30, y2 = 60;

		for (Shape shape : shapes) {
			shape.draw(x1, y1, x2, y2);
		}
	}
}
