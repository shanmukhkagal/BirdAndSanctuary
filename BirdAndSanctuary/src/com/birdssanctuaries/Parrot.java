package com.birdssanctuaries;

public class Parrot extends Bird implements Flyable {
	public static int count;
	
	//BirdColor = BirdColor.GREEN;
	  
	public Parrot(String id) {
		birdColor = BirdColor.GREEN;
		this.id = id; 
	}
	public void swim() {
		}
     public void eat() {
		System.out.println("parrot can eat");
	}
    public void fly()
    {
    	System.out.println("parrot can fly");
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
