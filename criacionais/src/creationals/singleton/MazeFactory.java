package creationals.singleton;

import creationals.maze.Door;
import creationals.maze.Maze;
import creationals.maze.Room;
import creationals.maze.Wall;

public class MazeFactory {
	private static MazeFactory _instance = null;
	
	protected MazeFactory() {
		
	}
	
	public static MazeFactory getInstance() {
		if(_instance == null) {
			_instance = new MazeFactory();
		}
		return _instance;
	}
	
	public Maze MakeMaze() {
		return new Maze();
	}
	
	public Wall MakeWall() {
		return new Wall();
	}
	
	public Room MakeRoom(int n) {
		return new Room(n);
	}
	
	public Door MakeDoor(Room r1, Room r2) {
		return new Door(r1, r2);
	}
}
