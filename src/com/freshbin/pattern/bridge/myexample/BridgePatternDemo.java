package com.freshbin.pattern.bridge.myexample;

import com.freshbin.pattern.bridge.myexample.hero.GameHero;
import com.freshbin.pattern.bridge.myexample.hero.HouYiHero;
import com.freshbin.pattern.bridge.myexample.hero.YaSeHero;
import com.freshbin.pattern.bridge.myexample.skill.SkillOne;
import com.freshbin.pattern.bridge.myexample.skill.SkillTwo;

/**
 * 桥接模式
 * 
 * @author freshbin
 * @date 2019年1月12日 下午8:04:57
 */
public class BridgePatternDemo {
	public static void main(String[] args) {
		GameHero yaSeHero = new YaSeHero(new SkillOne());
		yaSeHero.heroFirstSkill();
		yaSeHero.heroSecondSkill();

		System.out.println("============");

		GameHero houYiHero = new HouYiHero(new SkillTwo());
		houYiHero.heroFirstSkill();
		houYiHero.heroSecondSkill();
	}
}
