package _01_Olympic_Rings;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.

	public static void main(String[] args) {
		
		final Color deepGreen = new Color(34, 139, 34);
		
		final Robot rob1 = new Robot(200,100);
		rob1.hide();
		final Robot rob2 = new Robot(300,200);
		rob2.hide();
		final Robot rob3 = new Robot(400,100);
		rob3.hide();
		final Robot rob4 = new Robot(500,200);
		rob4.hide();
		final Robot rob5 = new Robot(600,100);
		rob5.hide();

		rob1.setSpeed(10);
		rob2.setSpeed(10);
		rob3.setSpeed(10);
		rob4.setSpeed(10);
		rob5.setSpeed(10);

		Thread r1 = new Thread(()->{
			rob1.setPenColor(Color.BLUE);
			robcommand(rob1);
		});
		Thread r2 = new Thread(()->{
			rob2.setPenColor(Color.ORANGE);
			robcommand(rob2);
		});
		Thread r3 = new Thread(()->{
			rob3.setPenColor(Color.BLACK);
			robcommand(rob3);
		});
		Thread r4 = new Thread(()->{
			rob4.setPenColor(deepGreen);
			robcommand(rob4);
		});
		Thread r5 = new Thread(()->{
			rob5.setPenColor(Color.RED);
			robcommand(rob5);
		});

		r1.start();
		r2.start();
		r3.start();
		r4.start();
		r5.start();
	}
	
	public static void robcommand(Robot robot) {
		robot.penDown();
		robot.setPenWidth(15);
		for(int i = 0; i < 36; i++) {
			robot.turn(10);
			robot.move(15);
		}
		
	}
}






