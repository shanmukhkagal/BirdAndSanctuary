package com.birdssanctuaries;

public class  Penguin extends Bird implements Swimmable {
	public static int count;
	
	//BirdColor birdColor = BirdColor.BLACK;

	public Penguin(String id) {
		birdColor = BirdColor.BLACK;
		this.id = id;
	}

	public void swim() {
		System.out.println("Penguin  can swim");
	}
	
	public void eat() {
		System.out.println("Penguin  can eat");
	}

	public void fly() {
		
	}
	
	 @Override
	 public int getCount() {
	    return getCount();
	 }
	 
	 public void incrementCount() {
		count++;
	}

	@Override
	int decrementCount() {
		return count--;
	}
}
