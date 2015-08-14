package pers.moonleo.patterns.mediator;

import pers.moonleo.patterns.mediator.inter.impl.Iraq;
import pers.moonleo.patterns.mediator.inter.impl.USA;
import pers.moonleo.patterns.mediator.med.impl.UnitedNationsSecurityCouncil;

public class Client {
	public static void main(String[] args) {
		UnitedNationsSecurityCouncil council = new UnitedNationsSecurityCouncil();
		
		USA usa = new USA(council);
		Iraq iraq = new Iraq(council);
		
		council.setCountry1(usa);
		council.setCountry2(iraq);
		
		usa.declare("不准研制武器！");
		iraq.declare("没有核武器！");
	}
}
