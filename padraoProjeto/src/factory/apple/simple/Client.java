package factory.apple.simple;

import factory.apple.simple.factory.SimpleFactory;
import factory.apple.simple.model.Iphone;

public class Client {

	public static void main(String[] args) {
		System.out.println("retorna um Iphone 11");
		Iphone iphone11 = SimpleFactory.orderIphone("11", "standard");
		
		System.out.println("--------------------------------------------------");
		System.out.println();
		
		System.out.println("retorna Iphone 11 pro");
		Iphone iphone11Pro = SimpleFactory.orderIphone("11", "highEnd");
		
		System.out.println("--------------------------------------------------");
		System.out.println();
		System.out.println("Iphone x  ");
		Iphone x = SimpleFactory.orderIphone("X", "standard");
		System.out.println("--------------------------------------------------");
		System.out.println();
		System.out.println("Iphone XSmax  ");
		Iphone xH = SimpleFactory.orderIphone("X", "highEnd");

	}

}
