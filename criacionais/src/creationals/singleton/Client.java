package creationals.singleton;

import creationals.maze.Maze;

public class Client {

	public void test1() {
		MazeGame game = new MazeGame();

		MazeFactory mazeFactory;

		mazeFactory = MazeFactory.getInstance();
		Maze maze = game.CreateMaze(mazeFactory);
	}

	
}
