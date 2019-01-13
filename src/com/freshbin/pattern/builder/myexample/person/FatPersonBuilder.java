package com.freshbin.pattern.builder.myexample.person;

import java.awt.Graphics;

/**
 * 胖小人
 * 
 * @author freshbin
 * @date 2019-1-13 15:26:37
 */
public class FatPersonBuilder extends PersonBuilder {

	@Override
	public void builderHead() {
		graphics.drawOval(50, 20, 30, 30);
	}

	@Override
	public void builderBody() {
		graphics.drawRect(50, 50, 30, 50);
	}

	@Override
	public void builderArmLeft() {
		graphics.drawLine(50, 50, 40, 100);
	}

	@Override
	public void builderArmRight() {
		graphics.drawLine(80, 50, 90, 100);
	}

	@Override
	public void builderLegLeft() {
		graphics.drawLine(50, 100, 45, 150);
	}

	@Override
	public void builderLegRight() {
		graphics.drawLine(80, 100, 85, 150);
	}

	@Override
	public void paint(Graphics graphics) {
		super.paint(graphics);
		this.graphics = graphics;
		builderHead();
		builderBody();
		builderArmLeft();
		builderArmRight();
		builderLegLeft();
		builderLegRight();
	}
}
