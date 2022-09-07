package creationals.factoryMethod;

import creationals.maze.Direction;
import creationals.maze.Door;
import creationals.maze.Maze;
import creationals.maze.Room;
import creationals.maze.Wall;

public class MazeGame {

	public Maze CreateMaze() {
		Maze aMaze = MakeMaze();
		Room r1 = MakeRoom(1);
		Room r2 = MakeRoom(2);
		Door aDoor = MakeDoor(r1, r2);
		
		aMaze.AddRoom(r1);
		aMaze.AddRoom(r2);
		
		r1.SetSide(Direction.NORTH, MakeWall());
		r1.SetSide(Direction.EAST, aDoor);
		r1.SetSide(Direction.SOUTH, MakeWall() ) ;
		r1.SetSide(Direction.WEST, MakeWall());

		return aMaze;
	}
	// Factory Methods
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
