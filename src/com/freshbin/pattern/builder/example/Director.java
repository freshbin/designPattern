package com.freshbin.pattern.builder.example;

import com.freshbin.pattern.builder.example.builder.AbsBuilder;

public class Director {
	private AbsBuilder builder;

	public Director(AbsBuilder builder) {
		this.builder = builder;
	}

	public void setBuilder(AbsBuilder builder) {
		this.builder = builder;
	}

	public void construct() {
		builder.buildvacation();
		builder.getVacation().showInfo();
	}
}
