package creationals.factoryMethod;

import creationals.maze.BombedWall;
import creationals.maze.Room;
import creationals.maze.RoomWithABomb;
import creationals.maze.Wall;

public class BombedMazeGame extends MazeGame{

	@Override
	public Wall MakeWall() {
		return new BombedWall();
	}
	
	@Override
	public Room MakeRoom(int n) {
		return new RoomWithABomb(n);
	}
}
