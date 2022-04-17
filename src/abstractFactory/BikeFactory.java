package abstractFactory;

public class BikeFactory extends AbstractFactoryWorkshop {

	
	@Override
	Doll INeedDolls() {
		//Factory cannot return dolls.
		return null;
	}
	
	@Override
	Bike INeedBikes() {

		return new Bike();
	}

}