package javagame;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Menu extends BasicGameState {
	
	Image playNow;
	Image exitGame;
	int xpos = 100;
	int ypos = 100;
	public String mouse = "No Input Yet!";

	public Menu(int state) {

	}

	public void init(GameContainer gc, StateBasedGame sbg)
			throws SlickException {
		playNow = new Image("res/playNow.png");
		exitGame = new Image("res/exitGame.png");
		
	}

	public void render(GameContainer gc, StateBasedGame sbg, Graphics g)
			throws SlickException {
		g.drawString(mouse, 60, 20);

		g.drawString("Welcome to Buckyland", 100, 50);
		playNow.draw(100,100);
		exitGame.draw(100,200);

	}

	public void update(GameContainer gc, StateBasedGame sbg, int delta)
			throws SlickException {
		xpos = Mouse.getX();
		ypos = Mouse.getY();
		mouse = "Mouse X position: " + xpos + ", Y position: " + ypos;
		
		// Play Now
		if ( (xpos > 100 && xpos < 311) && (ypos > 882 && ypos < 920) ) {
			if (Mouse.isButtonDown(0)) {
				sbg.enterState(1);
			}
		}

		// Exit the game
		if ( (xpos > 100 && xpos < 311) && (ypos > 781 && ypos < 819) ) {
			if (Mouse.isButtonDown(0)) {
				System.exit(0);
			}
		}

		
	}

	public int getID() {
		return 0;
	}

}
