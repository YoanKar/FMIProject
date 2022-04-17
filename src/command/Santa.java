package command;

public class Santa {

	private Command command;
	
	public Command getCommand() {
		return command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void sayCommand() {
		if(this.command == null) {
			System.out.println("No command said.");
			return;
		}
		this.command.execute();
	}
}
