package com.freshbin.pattern.builder.myexample.person;

import java.awt.Graphics;

import javax.swing.JFrame;

/**
 * 建造小人指挥者
 * 
 * @author freshbin
 * @date 2019年1月13日 上午11:12:58
 */
public class PersonDirector extends JFrame {
	
	private PersonBuilder personBuilder;
	
	public PersonDirector(PersonBuilder personBuilder, Integer width, Integer hight) {
		this.personBuilder = personBuilder;
		this.add(personBuilder);
		this.setSize(width, hight);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void builderPerson() {
		/*personBuilder.builderHead();
		personBuilder.builderBody();
		personBuilder.builderArmLeft();
		personBuilder.builderArmRight();
		personBuilder.builderLegLeft();
		personBuilder.builderLegRight();*/
	}
}
