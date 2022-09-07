package creationals.builder;

import creationals.maze.Maze;

public interface MazeBuilder {
	
	public void BuildMaze();
	public void BuildRoom(int room);
	public void BuilDoor(int roomFrom, int roomTo);
	public Maze GetMaze(); 
}
