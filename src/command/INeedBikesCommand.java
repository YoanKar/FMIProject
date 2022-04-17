package command;

public class INeedBikesCommand implements Command{

	private BlackBoard blackBoard;
	
	
	public INeedBikesCommand(BlackBoard blackBoard) {
		this.blackBoard = blackBoard;
	}
	
	@Override
	public void execute() {
		this.blackBoard.INeedBikes();
	}
}
