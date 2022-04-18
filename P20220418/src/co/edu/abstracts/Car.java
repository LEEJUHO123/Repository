package co.edu.abstracts;

public abstract class Car {

	private String model;
	public abstract void turnOn(); // 시동켜는기능.
	public abstract void start(); //출발기능.
	public abstract void run(); // 운전기능.
	public abstract void stop(); //멈춤기능.
	public abstract void turnOff(); //시동끄는기능.
}
