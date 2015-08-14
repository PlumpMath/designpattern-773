package pers.moonleo.patterns.mediator.inter.impl;

import pers.moonleo.patterns.mediator.inter.Country;
import pers.moonleo.patterns.mediator.med.Mediator;

public class Iraq extends Country{

	public Iraq(Mediator mediator) {
		super(mediator);
	}
	
	public void declare(String message) {
		mediator.send(message, this);
	}
	
	public void getMessage(String message) {
		System.out.println("伊拉克获得消息：" + message);
	}

}
