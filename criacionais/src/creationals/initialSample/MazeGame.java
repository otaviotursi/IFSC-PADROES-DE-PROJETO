package creationals.initialSample;

import creationals.maze.Direction;
import creationals.maze.Door;
import creationals.maze.Maze;
import creationals.maze.Room;
import creationals.maze.Wall;

public class MazeGame {

	public Maze CreateMaze() {
		Maze aMaze = new Maze();
		
		Room r1 = new Room(1);
		Room r2 = new Room(2);
		
		Door theDoor = new Door(r1, r2);
		
		aMaze.AddRoom(r1);
		aMaze.AddRoom(r2);
		
		r1.SetSide(Direction.NORTH, new Wall());
		r1.SetSide(Direction.EAST, theDoor);
		r1.SetSide(Direction.SOUTH, new Wall());
		r1.SetSide(Direction.WEST, new Wall());

		r2.SetSide(Direction.NORTH, new Wall());
		r2.SetSide(Direction.EAST, new Wall());
		r2.SetSide(Direction.SOUTH, new Wall());
		r2.SetSide(Direction.WEST, theDoor);

		return aMaze;
	}
}
