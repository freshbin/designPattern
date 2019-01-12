package com.freshbin.pattern.bridge.myexample.hero;

import com.freshbin.pattern.bridge.myexample.skill.HeroSkillInterface;

/**
 * 游戏英雄接口
 * 
 * @author freshbin
 * @date 2019年1月12日 下午8:12:03
 */
public abstract class GameHero {
	protected HeroSkillInterface heroSkill;

	public GameHero(HeroSkillInterface heroSkill) {
		this.heroSkill = heroSkill;
	}

	public abstract void heroFirstSkill();

	public abstract void heroSecondSkill();
}
