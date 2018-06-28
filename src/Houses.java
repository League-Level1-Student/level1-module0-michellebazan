import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Robot rob = null;
public static void main(String[] args) {

	rob = new Robot();
	rob.moveTo(15, 550);
	rob.hide();
	rob.setSpeed(100);
	rob.penDown();
	
	Random randy = new Random();
	
	
	for (int i = 0; i < 10; i++) {
	drawHouse(randy.nextInt(50)+1);
	}
	
	}

public static void drawHouse(int height) {

	rob.setAngle(0);
	rob.setRandomPenColor();
	rob.move(height);
	rob.setAngle(90);
	rob.move(50);
	rob.setAngle(180);
	rob.move(height);
	rob.setAngle(90);
	rob.setPenColor(0, 175, 0);
	rob.move(20);
	
	
	}
}
