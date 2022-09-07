package creationals.maze;

public class Door implements MapSite {

	private boolean isOpen;
	private Room _room1;
	private Room _room2;
	
	// Empty, for prototype
	public Door() {
		
	}
	
	public Door(Room _room1, Room _room2) {
		this._room1 = _room1;
		this._room2 = _room2;
	}


	@Override
	public void Enter() {
		// TODO Auto-generated method stub

	}

	@Override
	public Door Clone() {
		// TODO Auto-generated method stub
		return null;
	}


	public void Initialize(Room r1, Room r2) {
		_room1 = r1;
		_room2 = r2;
	}

}
