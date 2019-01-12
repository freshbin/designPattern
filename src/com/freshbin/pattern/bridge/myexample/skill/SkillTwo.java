package com.freshbin.pattern.bridge.myexample.skill;

/**
 * 技能类二
 * 
 * @author freshbin
 * @date 2019年1月12日 下午8:30:15
 */
public class SkillTwo implements HeroSkillInterface {

	@Override
	public void firstSkill() {
		System.out.println("一Q一个敌方英雄!");
	}

	@Override
	public void secondSkill() {
		System.out.println("一W一个五杀!");
	}

}
