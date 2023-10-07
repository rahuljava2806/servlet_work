package com.practicejava2;

abstract class Pen1{
	abstract void write();
	abstract void refil();
}

class FountainPen extends Pen{
	
	void write() {
		System.out.println("Writing...");
	}
	
	void refil() {
		System.out.println("Refiling...");
	}
	
	void changeNib() {
		System.out.println("Changing the nib");
	}
}

class Monkey{
	void jump() {
		System.out.println("Jumping...");
	}
	
	void bite() {
		System.out.println("Biting...");
	}
}

interface BasicAnimal{
	void eat();
	void sleep();
}

class Human extends Monkey implements BasicAnimal{
	
	public void eat() {
		System.out.println("Eating...");
	}
	
	public void sleep() {
		System.out.println("Sleeping...");
	}
}

abstract class Telephone{
	
	abstract void ring();
	abstract void lift();
	abstract void dissconnect();
	
	void rahul() {
		System.out.println("Rahul ");
	}
}

class Smartphone extends Telephone {
	public void ring() {
		System.out.println("Ringing...");
	}
	
	public void lift() {
		System.out.println("Lifting...");
	}
	
	public void dissconnect() {
		System.out.println("Dissconnecting...");
	}
	
	public void priya() {
		System.out.println("Priya !!");
	}
}

public class Pen {
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Telephone t = new SmartPhone();
		
		
	}

}
