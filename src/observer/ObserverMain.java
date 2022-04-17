package observer;

public class ObserverMain {

	public static void main(String[] args) {
		
		BlackBoard blackBoard = new BlackBoard();
		
		Observer dwarf1 = new Dwarf("Dwarf 1");
		Observer dwarf2 = new Dwarf("Dwarf 2");
		Observer dwarf3 = new Dwarf("Dwarf 3");
		
		blackBoard.subscribe(dwarf1);
		blackBoard.subscribe(dwarf2);
		blackBoard.subscribe(dwarf3);
		
		blackBoard.setContent("Doll");
		blackBoard.setContent("Bike");
		
		System.out.println(blackBoard.getUpdate());

	}

}
