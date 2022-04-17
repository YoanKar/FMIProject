package abstractFactory;

public class AbstractFactoryMain {

	public static void main(String[] args) {


		AbstractFactoryWorkshop toyFactory = FactoryProducer.getFactory("Doll");
		Doll doll = toyFactory.INeedDolls();
		doll.work();

		AbstractFactoryWorkshop bikeFactory = FactoryProducer.getFactory("Bike");
		Bike bike = bikeFactory.INeedBikes();
		bike.work();

		
	}

}