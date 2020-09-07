
/* LOGOS academy*/

package ua.lviv.lgs.auto;

/***
 * @since java 1.8
 * @author mimo3a
 * @version 1.1
 * 
 * 
 */

import java.util.Random;

public class AutoList{
	/*Name of class*/
	private int power;
	private int year;
	private int diameter;
	private String material;
	private int cilinders;
	private WheelList wheel;	
	private EngineList  engine;


	
	
	public AutoList(WheelList wheel, EngineList engine) {
		
		this.power = setPower();
		this.year = setYear();
		this.wheel = wheel;
		this.engine = engine;
		this.diameter = wheel.setDiameter();	    
	    this.material = wheel.setMaterial();
	    this.cilinders = engine.setCilinders();
	    
		
		
	}
	public double getPower() {
		return power;
	}
	public int setPower() {
		power = new Random().nextInt(300 - 50) + 50;
		return power;
	}
	public int getYear() {
		return year;
	}
	public int setYear() {
		year = new Random().nextInt(2020 - 1980) + 1980;
		return year;
	}
	
	public int getDiameter() {
		return diameter;
	}
	public String getMaterial() {
		return material;
	}
	public int getCilinders() {
		return cilinders;
	}
	public WheelList getWheel() {
		return wheel;
	}
	public EngineList getEngine() {
		return engine;
	}
	@Override
	public String toString() {
		return "Auto [power=" + power + ", year=" + year + ", wheel=" + wheel + ", engine=" + engine + "]";
	}
	
	

}

	
	
	
	
	
	
	



