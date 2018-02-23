package tw.mars.rover;

import java.util.List;

public class Plateau {
	private int uppermost;
	private int rightmost;
	private int lowermost;
	private int leftmost;
	
	private List<Rover> rovers;
	
	public int getLowermost() {
		return lowermost;
	}
	public void setLowermost(int lowermost) {
		this.lowermost = lowermost;
	}
	public int getLeftmost() {
		return leftmost;
	}
	public void setLeftmost(int leftmost) {
		this.leftmost = leftmost;
	}
	public List<Rover> getRovers() {
		return rovers;
	}
	public void setRovers(List<Rover> rovers) {
		this.rovers = rovers;
	}
	public int getUppermost() {
		return uppermost;
	}
	public void setUppermost(int uppermost) {
		this.uppermost = uppermost;
	}
	public int getRightmost() {
		return rightmost;
	}
	public void setRightmost(int rightmost) {
		this.rightmost = rightmost;
	}
	
	
}
