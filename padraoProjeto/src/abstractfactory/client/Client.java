package abstractfactory.client;

import abstractfactory.abstractFactory.BrazilianRulesAbstractFactory;
import abstractfactory.abstractFactory.CountryRulesAbstractFactory;
import abstractfactory.factory.Iphone11factory;
import abstractfactory.factory.IphoneFactory;
import abstractfactory.factory.IphoneXfactory;
import abstractfactory.model.Iphone;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CountryRulesAbstractFactory rules = new BrazilianRulesAbstractFactory();
		
		IphoneFactory genXFactory = new IphoneXfactory(rules);
		IphoneFactory gen11Factory = new Iphone11factory(rules);
		
		Iphone iphone = genXFactory.orderIPhone("standard");
		System.out.println(iphone);
		
		System.out.println();
		
		Iphone iphone2 = gen11Factory.orderIPhone("standard");
		System.out.println(iphone2);
		
		
		

	}

}
