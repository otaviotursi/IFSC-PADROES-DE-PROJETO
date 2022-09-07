package creationals.maze;

public enum Direction {
	
	NORTH(0),
	SOUTH(1),
	EAST(2),
	WEST(3);
	

	private final int index; 
	
	Direction(int _index) {
        this.index = _index;
    }
	
	public int GetIndex() {
		return index;
	}
}
