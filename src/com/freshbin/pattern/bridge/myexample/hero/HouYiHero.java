package com.freshbin.pattern.bridge.myexample.hero;

import com.freshbin.pattern.bridge.myexample.skill.HeroSkillInterface;

/**
 * 后羿英雄
 * 
 * @author freshbin
 * @date 2019年1月12日 下午8:25:31
 */
public class HouYiHero extends GameHero {

	public HouYiHero(HeroSkillInterface heroSkill) {
		super(heroSkill);
		System.out.println("这是后羿!");
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
