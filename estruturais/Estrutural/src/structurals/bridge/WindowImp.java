package structurals.bridge;

import structurals.adapter.Coord;
import structurals.adapter.Point;

public interface WindowImp {

		void ImpTop();
		void ImpBottom();
		void ImpSetExtent(Point p);
		void ImpSetOrigin(Point p);
		void DeviceRect(Coord c1, Coord c2, Coord c3, Coord c4);
		void DeviceText(char[] c, Coord c1, Coord c2);
		void DeviceBitmap(char[] c, Coord c1, Coord c2);
}
