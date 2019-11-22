package fabricas;

import models.AbstractDoor;
import models.AbstractRoom;
import models.AbstractWall;
import models.Door;
import models.Room;
import models.Wall;

public class SimpleMazeFactory extends AbstractMazeFactory{

	public AbstractRoom createRoom() {
		return new Room();
	}
	
	public AbstractDoor createDoor() {
		return new Door();
	}
	
	public AbstractWall createWall() {
		return new Wall();
	}
}
