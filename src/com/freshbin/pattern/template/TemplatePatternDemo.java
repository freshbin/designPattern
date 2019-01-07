package com.freshbin.pattern.template;

import com.freshbin.pattern.template.game.Game;
import com.freshbin.pattern.template.game.GloryOfKingGame;
import com.freshbin.pattern.template.game.LOLGame;

/**
 * 模板方法模式
 * 
 * @author freshbin
 * @date 2019-1-7 19:57:56
 */
public class TemplatePatternDemo {
	public static void main(String[] args) {
		Game lolGame = new LOLGame();
		lolGame.play();
		
		System.out.println("===========================");
		
		Game gloryOfKingGame = new GloryOfKingGame();
		gloryOfKingGame.play();
	}
}
