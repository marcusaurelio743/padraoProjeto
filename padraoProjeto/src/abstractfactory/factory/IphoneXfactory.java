package abstractfactory.factory;

import abstractfactory.abstractFactory.CountryRulesAbstractFactory;
import abstractfactory.model.Iphone;
import abstractfactory.model.IphoneXSmart;

public class IphoneXfactory extends IphoneFactory {

	public IphoneXfactory(CountryRulesAbstractFactory rules) {
		super(rules);
		
	}

	@Override
	protected Iphone createIPhone(String level) {
		if(level.equals("standard")) {
			return new abstractfactory.model.IphoneX(rules);
		} else if(level.equals("highEnd")) {
			return new IphoneXSmart(rules);
		} else return null;
	}

}
