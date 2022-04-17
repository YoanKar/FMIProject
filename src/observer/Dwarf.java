package observer;

public class Dwarf implements Observer{

	private String name;
	private Observable blackBoard;
	
	
	public Dwarf(String name) {
		this.name = name;
	}
	
	@Override
	public void update() {
		if(this.blackBoard == null) {
			System.out.println("Nothing on the board!");
			return;
		}
		String lastInfo = this.blackBoard.getUpdate();
		
		//Each dwarf takes one unit of the required toy.
		System.out.println(this.name + " went to get one " + lastInfo + " form the workshop.");
	}

	@Override
	public void setObservable(Observable blackBoard) {
		this.blackBoard = blackBoard;
	}
}
