package command;

public class INeedDollsCommand implements Command{

     private BlackBoard blackBoard;
	
	public INeedDollsCommand(BlackBoard blackBoard) {
		this.blackBoard = blackBoard;
	}

	@Override
	public void execute() {
		this.blackBoard.INeedDolls();
	}
}
