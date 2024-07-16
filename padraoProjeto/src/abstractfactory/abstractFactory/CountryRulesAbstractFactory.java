package abstractfactory.abstractFactory;

import abstractfactory.model.Certificate;
import abstractfactory.model.Packing;


public interface CountryRulesAbstractFactory {
	
	Certificate getCertificate();
	Packing getPacking();
}
