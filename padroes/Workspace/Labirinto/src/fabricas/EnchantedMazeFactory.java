package fabricas;

import models.AbstractDoor;
import models.AbstractRoom;
import models.AbstractWall;
import models.EnchantedDoor;
import models.EnchantedRoom;
import models.EnchantedWall;

public class EnchantedMazeFactory extends AbstractMazeFactory{

	public AbstractRoom createRoom() {
		return new EnchantedRoom();
	}
	
	public AbstractDoor createDoor() {
		return new EnchantedDoor();
	}
	
	public AbstractWall createWall() {
		return new EnchantedWall();
	}
	
}
