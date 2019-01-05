package com.freshbin.pattern.command.example.command;

public interface Command {
	public void execute();

	public void undo();
}
