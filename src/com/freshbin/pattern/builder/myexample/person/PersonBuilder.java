package com.freshbin.pattern.builder.myexample.person;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

/**
 * 小人建造接口
 * 
 * @author freshbin
 * @date 2019年1月13日 上午11:01:47
 */
public abstract class PersonBuilder extends JPanel {
	protected Graphics graphics;
	
	abstract void builderHead();

	abstract void builderBody();

	abstract void builderArmLeft();

	abstract void builderArmRight();

	abstract void builderLegLeft();

	abstract void builderLegRight();
}
