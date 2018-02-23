package tw.mars.rover;

public class Rover {
	private int xCoordinate;
	private int yCoordinate;
	private Direction direction;
	
	public Direction getDirection() {
		return direction;
	}
	public void setDirection(Direction direction) {
		this.direction = direction;
	}
	public int getxCoordinate() {
		return xCoordinate;
	}
	public void setxCoordinate(int xCoordinate) {
		this.xCoordinate = xCoordinate;
	}
	public int getyCoordinate() {
		return yCoordinate;
	}
	public void setyCoordinate(int yCoordinate) {
		this.yCoordinate = yCoordinate;
	}
	
	public void move(String motion) {
		if(motion.equals("L")){
			direction = Direction.valueOf(direction.getLeftside());
		}
		else if (motion.equals("R")) {
			direction = Direction.valueOf(direction.getRightside());
		}
		else {
			MovementHelper.decideMovementDirection(direction);
		}
	}
	
}
