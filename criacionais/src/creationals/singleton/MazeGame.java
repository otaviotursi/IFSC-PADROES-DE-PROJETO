package creationals.singleton;

import creationals.maze.Direction;
import creationals.maze.Door;
import creationals.maze.Maze;
import creationals.maze.Room;

public class MazeGame {
	public Maze CreateMaze(MazeFactory factory) {
		Maze aMaze = factory.MakeMaze();
		Room r1 = factory.MakeRoom(1);
		Room r2 = factory.MakeRoom(2);
		Door aDoor = factory.MakeDoor(r1, r2);
		
		aMaze.AddRoom(r1);
		aMaze.AddRoom(r2);
		
		r1.SetSide(Direction.NORTH, factory.MakeWall());
		r1.SetSide(Direction.EAST, aDoor);
		r1.SetSide(Direction.SOUTH, factory.MakeWall() ) ;
		r1.SetSide(Direction.WEST, factory.MakeWall());

		return aMaze;
	}
}
