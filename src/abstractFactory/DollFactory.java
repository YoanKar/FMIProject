package abstractFactory;

public class DollFactory extends AbstractFactoryWorkshop {

	
	@Override
	Doll INeedDolls() {
		return new Doll();
	}
	
	@Override
	Bike INeedBikes() {
		//Factory cannot return bikes.
		return null;
	}

}