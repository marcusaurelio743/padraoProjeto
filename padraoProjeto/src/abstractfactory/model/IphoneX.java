package abstractfactory.model;

import abstractfactory.abstractFactory.CountryRulesAbstractFactory;

public class IphoneX extends Iphone {

	public IphoneX(CountryRulesAbstractFactory rules) {
		super(rules);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getHardware() {
		System.out.println("dados de um Iphone x");
		
	}

}
