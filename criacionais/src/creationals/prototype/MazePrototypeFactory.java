package creationals.prototype;

import creationals.abstractFactory.MazeFactory;
import creationals.maze.Door;
import creationals.maze.Maze;
import creationals.maze.Room;
import creationals.maze.Wall;

public class MazePrototypeFactory extends MazeFactory {

	private Maze _prototypeMaze;
	private Room _prototypeRoom;
	private Wall _prototypeWall;
	private Door _prototypeDoor;

	public MazePrototypeFactory(Maze m, Wall w, Room r, Door d) {
		super();
		this._prototypeMaze = m;
		this._prototypeRoom = r;
		this._prototypeWall = w;
		this._prototypeDoor = d;
	}
	@Override
	public Wall MakeWall() {
		return _prototypeWall.Clone();
	}
	@Override
	public Door MakeDoor(Room r1, Room r2) {
		Door door = _prototypeDoor.Clone();
		door.Initialize(r1, r2);
		return door;
	}
}
