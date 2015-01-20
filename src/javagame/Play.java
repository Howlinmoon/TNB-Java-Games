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
		worldMap = new Image("res/world.png");
		Image[] walkUp = {new Image("res/buckysBack.png"), new Image("res/buckysBack.png")};
		Image[] walkDown = {new Image("res/buckysFront.png"), new Image("res/buckysFront.png")};
		Image[] walkLeft = {new Image("res/buckysLeft.png"), new Image("res/buckysLeft.png")};
		Image[] walkRight = {new Image("res/buckysRight.png"), new Image("res/buckysRight.png")};
		
		movingUp = new Animation(walkUp, duration,  false);
		movingDown = new Animation(walkDown, duration,  false);
		movingLeft = new Animation(walkLeft, duration,  false);
		movingRight = new Animation(walkRight, duration,  false);
		
		bucky = movingDown;
	}
	
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
		worldMap.draw(buckyPositionX, buckyPositionY);
		bucky.draw(shiftX, shiftY);
		g.drawString("Bucky X: "+buckyPositionX+"\nBucky Y: "+buckyPositionY, 400, 20);
		
		if (quit == true) {
			g.drawString("Resume (R)", 250, 100);
			g.drawString("Main Menu (M)", 150, 100);
			g.drawString("Quit Game (Q)", 50, 100);
			if (quit == false) {
				g.clear();
			}
		}
	}

	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
		
	}

	public int getID() {
		return 1;
	}
	
}
