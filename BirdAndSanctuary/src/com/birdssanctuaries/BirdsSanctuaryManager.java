package com.birdssanctuaries;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class BirdsSanctuaryManager {
    
	static BirdsSanctuaryManager instance;
	Set<Bird> birdSet =  new HashSet<Bird>(); 
	
	BirdsSanctuaryManager() {
		
	}
	
	public static BirdsSanctuaryManager getInstance() {
		if(instance == null) {
			instance = new BirdsSanctuaryManager();
		}
		return instance;
	}
	public void add(Bird bird) {
		
	    try{
			if (bird == null) {
				throw new BirdException("give valid input , object is empty");
			}
			else {
			if(birdSet.add(bird)) {
				System.out.println("The" + bird.birdColor.name() + "color bird is addeed");
			bird.incrementCount();
			}
			}
		}catch(BirdException e){
			e.printStackTrace();
		}
	}
	
	
	public void remove(Bird birds) {
		birdSet.remove(birdSet);
		birds.decrementCount();
	}
	
	public void printEatingbirds() {
		birdSet.stream().forEach(x-> {x.eat();});
	}
			
	public void printFlyingbirds() {
		birdSet.stream().filter(bird -> bird instanceof Flyable).forEach(bird -> ((Flyable)bird).fly());
	}
			
	public void printSwimmingbirds() {
		birdSet.stream().filter(bird -> bird instanceof Swimmable).forEach(bird -> ((Swimmable)bird).swim());
    }
}

			

			


