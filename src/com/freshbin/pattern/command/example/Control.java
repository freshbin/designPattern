package com.freshbin.pattern.command.example;

public interface Control {

	public void onButton(int slot);

	public void offButton(int slot);

	public void undoButton();
}
