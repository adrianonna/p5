package fabricas;

import models.AbstractDoor;
import models.AbstractRoom;
import models.AbstractWall;

public abstract class AbstractMazeFactory {
	
	public abstract AbstractRoom createRoom();
	
	public abstract AbstractDoor createDoor();
	
	public abstract AbstractWall createWall();

}
