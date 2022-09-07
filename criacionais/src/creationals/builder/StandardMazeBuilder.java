package creationals.builder;

import creationals.maze.Door;
import creationals.maze.Maze;
import creationals.maze.Room;

public class StandardMazeBuilder implements MazeBuilder{

	private Maze mazeUnderConstruction;
	
	@Override
	public void BuildMaze() {
		mazeUnderConstruction = new Maze();
	}

	@Override
	public void BuildRoom(int room) {
		Room r = new Room(room);
		mazeUnderConstruction.AddRoom(r);
	}

	@Override
	public void BuilDoor(int roomFrom, int roomTo) {
		Room r1 = mazeUnderConstruction.RoomNo(roomFrom);
		Room r2 = mazeUnderConstruction.RoomNo(roomTo);
		
		Door door = new Door(r1, r2);
		// continues....
	}

	@Override
	public Maze GetMaze() {
		return mazeUnderConstruction;
	}
}
