package creationals.maze;

import java.util.ArrayList;

public class Maze {

	private ArrayList<Room> rooms = new ArrayList<Room>();
	
	public void AddRoom(Room room) {
		rooms.add(room);
	}
	
	public Room RoomNo(int roomNo) {
		for (Room room : rooms) {
			if(room.GetRoomNumber() == roomNo) {
				return room;
			}
		}
		return null;
	}
}
