package com.freshbin.pattern.facade.example;

import com.freshbin.pattern.facade.example.hometheater.HomeTheaterFacade;

public class MainTest {
	public static void main(String[] args) {
		HomeTheaterFacade mHomeTheaterFacade = new HomeTheaterFacade();

		mHomeTheaterFacade.ready();
		mHomeTheaterFacade.play();
	}
}
