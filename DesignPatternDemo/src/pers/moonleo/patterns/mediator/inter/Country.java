package pers.moonleo.patterns.mediator.inter;

import pers.moonleo.patterns.mediator.med.Mediator;

public abstract class Country {
	protected Mediator mediator;
	
	public Country(Mediator mediator) {
		this.mediator = mediator;
	}
	
}
