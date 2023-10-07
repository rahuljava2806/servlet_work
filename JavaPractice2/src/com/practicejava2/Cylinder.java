package com.practicejava2;

public class Cylinder {
	
	private float radius = 0f;
	private float height = 0f;
	
	public void setRadius(float radius) {
		this.radius=radius;
	}
	
	public void setHeight(float height) {
		this.height=height;
	}
	
	public float getRadius() {
		return radius;
	}
	
	public float getHeight() {
		return height;
	}
	
	public void surfaceAreaOfCylinder() {
		float a = (float) ((2*Math.PI*this.radius*this.height) + (2*Math.PI*this.radius*this.radius));
		System.out.println("surface area of cylinder is : "+a);
	}
	
	public void VolumeOfCylinder() {
		float v = (float) Math.PI*this.radius*this.radius*this.height;
		System.out.println("Volume of cylinder is : "+v);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cylinder mycylinder = new Cylinder();
		mycylinder.setHeight(12);
		mycylinder.setRadius(10);
		mycylinder.surfaceAreaOfCylinder();
		mycylinder.VolumeOfCylinder();
		
		
		}

}
