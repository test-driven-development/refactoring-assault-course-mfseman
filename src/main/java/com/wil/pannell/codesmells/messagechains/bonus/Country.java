package com.wil.pannell.codesmells.messagechains.bonus;

public class Country {
	
	private boolean inEurope = false;
	
	public Country(boolean inEurope) {
		this.inEurope = inEurope;
	}

	public boolean isInEurope() {
		return inEurope;
	}

}