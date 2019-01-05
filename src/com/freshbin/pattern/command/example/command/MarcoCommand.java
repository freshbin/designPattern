package com.freshbin.pattern.command.example.command;

public class MarcoCommand implements Command {

	private Command[] commands;

	public MarcoCommand(Command[] commands) {
		this.commands = commands;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		for (int i = 0, len = commands.length; i < len; i++) {
			commands[i].execute();
		}
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		for (int i = commands.length - 1; i >= 0; i--) {
			commands[i].undo();

		}
	}

}
