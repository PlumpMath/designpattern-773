package pers.moonleo.patterns.mediator.med;

import pers.moonleo.patterns.mediator.inter.Country;

/**
 * 中介者
 */
public abstract class Mediator {
	public abstract void send(String message, Country country);
}
