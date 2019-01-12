package com.freshbin.pattern.bridge.example.control;

public interface Control {

	public void On();

	public void Off();

	public void setChannel(int ch);

	public void setVolume(int vol);

}
