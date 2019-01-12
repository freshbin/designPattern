package com.freshbin.pattern.bridge.myexample.hero;

import com.freshbin.pattern.bridge.myexample.skill.HeroSkillInterface;

/**
 * 亚瑟英雄
 * 
 * @author freshbin
 * @date 2019年1月12日 下午8:25:31
 */
public class YaSeHero extends GameHero {

	public YaSeHero(HeroSkillInterface heroSkill) {
		super(heroSkill);
		System.out.println("这是亚瑟!");
	}

	@Override
	public void heroFirstSkill() {
		heroSkill.firstSkill();
	}

	@Override
	public void heroSecondSkill() {
		heroSkill.secondSkill();
	}

}
