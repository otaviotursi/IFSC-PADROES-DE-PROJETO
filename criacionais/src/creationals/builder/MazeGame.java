package creationals.builder;

import creationals.maze.Maze;

public class MazeGame {

	public Maze CreateMaze(MazeBuilder builder) {
		builder.BuildMaze();
		
		builder.BuildRoom(1);
		builder.BuildRoom(2);
		builder.BuilDoor(1, 2);
		
		return builder.GetMaze();
	}
}
