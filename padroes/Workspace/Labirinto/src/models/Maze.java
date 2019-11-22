package models;

public class Maze {
	public AbstractRoom room;
	public AbstractDoor door;
	public AbstractWall wall;
	
	public AbstractRoom getRoom() {
		return room;
	}
	public void setRoom(AbstractRoom room) {
		this.room = room;
	}
	public AbstractDoor getDoor() {
		return door;
	}
	public void setDoor(AbstractDoor door) {
		this.door = door;
	}
	public AbstractWall getWall() {
		return wall;
	}
	public void setWall(AbstractWall wall) {
		this.wall = wall;
	}
}
