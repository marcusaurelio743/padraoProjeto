package factory.apple.simple.factory;

import factory.apple.simple.model.Iphone;
import factory.apple.simple.model.Iphone11;
import factory.apple.simple.model.Iphone11Pro;
import factory.apple.simple.model.IphoneX;
import factory.apple.simple.model.IphoneXSmax;

public class SimpleFactory {
	
	public static Iphone orderIphone(String generation, String level) {
		Iphone device = null;
		
		
		if(generation.equalsIgnoreCase("X")) {
			if(level.equalsIgnoreCase("standard")){
				device = new IphoneX();
			}else if(level.equalsIgnoreCase("highEnd")) {
				device = new IphoneXSmax();
			}
		}else if(generation.equalsIgnoreCase("11")) {
			if(level.equalsIgnoreCase("standard")) {
				device = new Iphone11();
			}else if(level.equalsIgnoreCase("highEnd")) {
				device = new Iphone11Pro();
			}
		}
		device.getHardware();
		device.assemble();
		device.certificates();
		device.pack();
		
		return device;
		
	}

}
