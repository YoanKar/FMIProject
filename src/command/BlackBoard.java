package command;

public class BlackBoard {

private String blackBoardContent;
	
	public void INeedDolls() {
		System.out.println("Doll added to the blackboard");
		this.blackBoardContent = "Doll";
	}
	
	public void INeedBikes() {
		System.out.println("Bike added to the blackboard");
		this.blackBoardContent = "Bike";
	}
}
