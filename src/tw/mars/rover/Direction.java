package tw.mars.rover;

public enum Direction {
	N ("W", "E"), E("N", "S"), S ("E", "W"), W("S", "N");
	
	private String leftside;
	private String rightside;
	
	Direction(String leftside, String rightside) {
		this.leftside = leftside;
		this.rightside = rightside;
	}
	
	public String getLeftside() {
		return this.leftside;
	}
	
	public String getRightside() {
		return this.rightside;
	}
}
