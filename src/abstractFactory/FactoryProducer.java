package abstractFactory;

public class FactoryProducer {

	public static AbstractFactoryWorkshop getFactory(String factoryName) {
		
		if(factoryName.equals("Doll")) {
			return new DollFactory();
		}
		
		if(factoryName.equals("Bike")) {
			return new BikeFactory();
		}
		
		System.out.println("Unknown factory");
		return null;

	}
	
}