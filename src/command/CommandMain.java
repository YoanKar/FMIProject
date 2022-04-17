package command;

public class CommandMain {

	public static void main(String[] args) {
		
		BlackBoard blackBoard = new BlackBoard();
		Command INeedDollsCommand = new INeedDollsCommand(blackBoard);
		Command INeedBikesCommand = new INeedBikesCommand(blackBoard);

		Santa santa = new Santa();
		
		santa.setCommand(INeedDollsCommand);
		santa.sayCommand();
		
		santa.setCommand(INeedBikesCommand);
		santa.sayCommand();

	}

}
