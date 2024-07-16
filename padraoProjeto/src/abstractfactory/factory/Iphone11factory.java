package abstractfactory.factory;

import abstractfactory.abstractFactory.CountryRulesAbstractFactory;
import abstractfactory.model.Iphone;
import abstractfactory.model.Iphone11;
import abstractfactory.model.Iphone11pro;

public class Iphone11factory extends IphoneFactory {

	public Iphone11factory(CountryRulesAbstractFactory rules) {
		super(rules);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected Iphone createIPhone(String level) {
		if(level.equals("standard")) {
			return new Iphone11(rules);
		} else if(level.equals("highEnd")) {
			return new Iphone11pro(rules);
		} else return null;
	}
	

}
