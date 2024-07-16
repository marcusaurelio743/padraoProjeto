package abstractfactory.model;

import abstractfactory.abstractFactory.CountryRulesAbstractFactory;

public class Iphone11pro extends Iphone {

	public Iphone11pro(CountryRulesAbstractFactory rules) {
		super(rules);
		
	}

	@Override
	public void getHardware() {
		System.out.println("Hardware list");
		System.out.println("\t- 6.5in Screen");
		System.out.println("\t- A13 Chipset");
		System.out.println("\t- 4Gb RAM");
		System.out.println("\t- 512Gb Memory");
		
	}
	
}
