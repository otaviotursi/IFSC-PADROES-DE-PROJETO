package creationals.maze;

public class Room implements MapSite {

	private int _roomNumber;
	private MapSite[] _sides;
	
	// Empty, for prototype
	public Room() {
		
	}
	
	public Room(int _roomNumber) {
		this._roomNumber = _roomNumber;
		this._sides = new MapSite[5];
	}
	
	public MapSite GetSide(Direction direction) {
		return _sides[direction.GetIndex()];
	}
	
	public void SetSide(Direction direction, MapSite site) {
		_sides[direction.GetIndex()] = site;
	}

	@Override
	public void Enter() {
		// TODO Auto-generated method stub

	}

	@Override
	public Room Clone() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public int GetRoomNumber() {
		return _roomNumber;
	}

}
