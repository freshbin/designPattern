package com.freshbin.pattern.builder.myexample.person;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

/**
 * 瘦小人
 * 
 * @author freshbin
 * @date 2019年1月13日 上午11:04:43
 */
public class ThinPersonBuilder extends PersonBuilder {
	
	@Override
	public void builderHead() {
		graphics.drawOval(50, 20, 30, 30);
	}

	@Override
	public void builderBody() {
		graphics.drawRect(60, 50, 10, 50);
	}

	@Override
	public void builderArmLeft() {
		graphics.drawLine(60, 50, 40, 100);
	}

	@Override
	public void builderArmRight() {
		graphics.drawLine(70, 50, 90, 100);
	}

	@Override
	public void builderLegLeft() {
		graphics.drawLine(60, 100, 45, 150);
	}

	@Override
	public void builderLegRight() {
		graphics.drawLine(70, 100, 85, 150);
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
