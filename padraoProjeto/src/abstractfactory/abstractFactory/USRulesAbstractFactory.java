package abstractfactory.abstractFactory;

import abstractfactory.model.Certificate;
import abstractfactory.model.Packing;
import abstractfactory.model.UsCertificado;
import abstractfactory.model.UsPacote;

public class USRulesAbstractFactory implements CountryRulesAbstractFactory {

	@Override
	public Certificate getCertificate() {
		
		return new UsCertificado();
	}

	@Override
	public Packing getPacking() {
		
		return new UsPacote();
	}

}
