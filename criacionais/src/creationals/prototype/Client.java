package creationals.prototype;

import creationals.abstractFactory.MazeGame;
import creationals.maze.BombedWall;
import creationals.maze.Door;
import creationals.maze.Maze;
import creationals.maze.Room;
import creationals.maze.RoomWithABomb;
import creationals.maze.Wall;

public class Client {

	public void test1() {
		MazeGame game = new MazeGame();

		MazePrototypeFactory simpleMazeFactory;

		simpleMazeFactory = new MazePrototypeFactory(new Maze(), new Wall(), new Room(), new Door());
		Maze maze = game.CreateMaze(simpleMazeFactory);
	}

	public void test2() {
		
		MazePrototypeFactory bombedMazeFactory;
		
		bombedMazeFactory = new MazePrototypeFactory(
				new Maze(), new BombedWall(),
				new RoomWithABomb(), new Door()
				) ;

	}
}
