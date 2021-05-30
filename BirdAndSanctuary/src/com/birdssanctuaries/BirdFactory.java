package com.birdssanctuaries;

enum Birds {PARROT,DUCK,PENGUIN,}
public class BirdFactory {
	public Bird get(Birds birdName, String string) {
		switch (birdName) {
		case PARROT:
			return new Parrot("pr1");
		case DUCK:
			return new Duck("d1");
		case PENGUIN:
			return new Duck("p1");
			default:
				return null;
			
		}
	}

}
