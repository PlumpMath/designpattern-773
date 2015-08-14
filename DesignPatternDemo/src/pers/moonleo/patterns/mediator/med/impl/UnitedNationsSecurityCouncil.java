package pers.moonleo.patterns.mediator.med.impl;

import pers.moonleo.patterns.mediator.inter.Country;
import pers.moonleo.patterns.mediator.inter.impl.Iraq;
import pers.moonleo.patterns.mediator.inter.impl.USA;
import pers.moonleo.patterns.mediator.med.Mediator;

public class UnitedNationsSecurityCouncil extends Mediator{
	
	private USA country1;
	private Iraq country2;

	@Override
	public void send(String message, Country country) {
		if(country == country1) {
			country2.getMessage(message);
		} else {
			country1.getMessage(message);
		}
	}

	public void setCountry1(USA country1) {
		this.country1 = country1;
	}

	public void setCountry2(Iraq country2) {
		this.country2 = country2;
	}

}
