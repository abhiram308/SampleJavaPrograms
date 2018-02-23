package tw.mars.rover;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main (String[] args) {
		Main main = new Main();
		Plateau plateau = main.acceptInput();
		
		Rover rover1 = new Rover();
		rover1.setxCoordinate(1);
		rover1.setyCoordinate(2);
		rover1.setDirection(Direction.N);
		String input1 = "LMLMLMLMM";
		for(int i = 0; i < input1.length(); i++) {
			rover1.move(input1.substring(i, i + 1));
		}
		
		Rover rover2 = new Rover();
		rover2.setxCoordinate(3);
		rover2.setyCoordinate(3);
		rover2.setDirection(Direction.E);
		String input2 = "MMRMMRMRRM";
		for(int i = 0; i < input2.length(); i++) {
			rover2.move(input2.substring(i, i + 1));
		}
		
	}
	
	public Plateau acceptInput() {
		Plateau plateau = new Plateau();
		plateau.setLeftmost(0);
		plateau.setLowermost(0);
		plateau.setUppermost(5);
		plateau.setRightmost(5);
		List<Rover> rovers = new ArrayList<Rover>();
		plateau.setRovers(rovers);
		
		Rover rover1 = new Rover();
		rover1.setxCoordinate(1);
		rover1.setyCoordinate(2);
		rover1.setDirection(Direction.N);
		
		Rover rover2 = new Rover();
		rover2.setxCoordinate(3);
		rover2.setyCoordinate(3);
		rover2.setDirection(Direction.E);
		
		rovers.add(rover1);
		rovers.add(rover2);
		
		return plateau;
	}
}
