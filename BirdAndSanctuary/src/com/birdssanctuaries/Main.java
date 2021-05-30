package com.birdssanctuaries;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Welcome to bird sancturay");
		
		BirdFactory birdFactory = new BirdFactory();
		BirdsSanctuaryManager bd = new BirdsSanctuaryManager();
		
		Duck duck = birdFactory.get("DUCK","d1");
		Duck duck2 = birdFactory.get("DUCK","d2");
		Parrot parrot = birdFactory.get("parrot","pr1");
		Parrot parrot2 = birdFactory.get("duck","pr2");
		WhiteParrot  whiteParrot =  birdFactory.get("id");
		Penguin penguin = birdFactory.get("penguin","pg1");
		
	    bd.add(duck);
        bd.add(duck);
	    bd.add(parrot);
	    bd.add(penguin);
	    bd.add(parrot);
	    bd.add(null); 
		
		bd.printEatingbirds();
		bd.printFlyingbirds();
		bd.printSwimmingbirds();
		
        System.out.println("Duck count "+Duck.count);
	    System.out.println("Parrot count "+Parrot.count);
	    System.out.println("Penguin count "+Penguin.count);
	    
	    //bd.remove(duck);
	    //bd.remove(parrot);
	    //bd.remove(penguin);
	    
	    System.out.println("Duck count "+Duck.count);
	    System.out.println("Parrot count "+Parrot.count);
	    System.out.println("Penguin count "+Penguin.count);
	    }
}
