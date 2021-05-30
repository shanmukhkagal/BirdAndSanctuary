package com.birdssanctuaries;

public abstract class Bird {
	
	BirdColor birdColor;
	
	String id;
	abstract void eat();
	abstract int getCount();
	abstract void incrementCount();
	abstract int  decrementCount();
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object id) {
		if (this == id)
			return true;
		if (id == null)
			return false;
		if (getClass() != id.getClass())
			return false;
		Bird other = (Bird) id;
		if (id == null) {
			if (this.id != null)
				return false;
		} else if (!id.equals(this.id))
			return false;
		return true;
	}
	}
enum BirdColor {
	BLACK, WHITE, GREEN;
}

