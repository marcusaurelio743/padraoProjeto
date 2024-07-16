package abstractfactory.abstractFactory;

import abstractfactory.model.CertificadoBrasil;
import abstractfactory.model.Certificate;
import abstractfactory.model.Packing;
import abstractfactory.model.pacoteBrasil;

public class BrazilianRulesAbstractFactory implements CountryRulesAbstractFactory {

	@Override
	public Certificate getCertificate() {
		
		return new CertificadoBrasil();
	}

	@Override
	public Packing getPacking() {
		
		return new pacoteBrasil();
	}

}
