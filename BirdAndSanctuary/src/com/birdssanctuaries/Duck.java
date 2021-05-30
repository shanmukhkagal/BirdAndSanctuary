package com.birdssanctuaries;

public  class Duck extends Bird implements Flyable , Swimmable {
	
	public static int count;
	
	//BirdColor = BirdColor.WHITE;
	
	public Duck(String id) {
		birdColor = BirdColor.WHITE;
		this.id = id;
		// TODO Auto-generated constructor stub
	}

	public void swim() {
		System.out.println("duck can swim");
	}
	
	public void eat() {
		System.out.println("duck can eat");
	}

	public void fly() {
	}
	
	@Override
    public int getCount() {
    	return count;
    }
	
	@Override
	public int setCount() {
    	return count;
    }
	
	public void incrementCount() {
	   count++;
	}

	@Override
	int decrementCount() {
		return count--;
	}
}
