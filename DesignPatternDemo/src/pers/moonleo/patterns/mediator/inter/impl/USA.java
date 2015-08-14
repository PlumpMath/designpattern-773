package pers.moonleo.patterns.mediator.inter.impl;

import pers.moonleo.patterns.mediator.inter.Country;
import pers.moonleo.patterns.mediator.med.Mediator;

public class USA extends Country {

	public USA(Mediator mediator) {
		super(mediator);
	}
	
	public void declare(String message) {
		mediator.send(message, this);
	}
	
	public void getMessage(String message) {
		System.out.println("美国获得消息:" + message);
	}

}
