package _02_Advanced_Robot_Race;

import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class AdvancedRobotRace {
	// Re-do the robot race recipe from level 3 module 0. 
	// This time, use threads to make all of the robots go at the same time.
	
	public static void main(String[] args) {
		
		
		Robot r1 = new Robot(300,900);
		Robot r2 = new Robot(500,900);
		Robot r3 = new Robot(700,900);
		Robot r4 = new Robot(900,900);
		Robot r5 = new Robot(1100,900);
		
		r1.setSpeed(2);
		r2.setSpeed(2);
		r3.setSpeed(2);
		r4.setSpeed(2);
		r5.setSpeed(2);
		
		Robot[] robarr = {r1,r2,r3,r4,r5};
		
		Thread t1 = new Thread(()->{
			robCommand(r1);
		});
		Thread t2 = new Thread(()->{
			robCommand(r2);
		});
		Thread t3 = new Thread(()->{
			robCommand(r3);
		});
		Thread t4 = new Thread(()->{
			robCommand(r4);
		});
		Thread t5 = new Thread(()->{
			robCommand(r5);
		});
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}
	public static void robCommand(Robot robot) {
		while(robot.getY() > 0) {
			
			int a = new Random().nextInt(100)-40;
			int b = new Random().nextInt(360)-180;
			
			int c = new Random().nextInt(100);
			
			if(robot.getY() - a < 0) {
				System.out.println(robot.toString() + " is the winner!!!!!");
				System.exit(0);
			}
			
			robot.move(a);
			robot.turn(b);
			
			
		}
	}
	
}
