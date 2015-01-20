package javagame;

import  org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Play extends BasicGameState {
	
	Animation bucky, movingUp, movingDown, movingLeft, movingRight;
	Image worldMap;
	boolean quit = false;
	int[] duration = {200,200};
	float buckyPositionX = 0;
	float buckyPositionY = 0;
	float shiftX = buckyPositionX + 640;
	float shiftY = buckyPositionY + 512;
	
	
	public Play(int state) {
		
	}
	
	public void init(GameContainer gc, StateBasedGame sbg)  throws SlickException {
		
	}
	
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {

	}

	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
		
	}

	public int getID() {
		return 1;
	}
	
}
