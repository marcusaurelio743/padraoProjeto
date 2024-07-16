package abstractfactory.model;

import abstractfactory.abstractFactory.CountryRulesAbstractFactory;

public class IphoneXSmart extends Iphone {

	public IphoneXSmart(CountryRulesAbstractFactory rules) {
		super(rules);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getHardware() {
		System.out.println("dados de um Iphone X Smart");
		
	}

}
