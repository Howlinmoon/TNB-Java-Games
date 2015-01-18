package javagame;

import  org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Menu extends BasicGameState {
	public Menu(int state) {
		
	}
	
	public void init(GameContainer gc, StateBasedGame sbg)  throws SlickException {
		
	}
	
	// 50,50 = x,y
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
		g.drawString("Are you ready to blast some ham!?!?",50,50);
		g.drawRect(50, 100, 60, 120);  // x,y,width,height
		g.drawOval(200,130, 130, 80); // x,y,width,height
		
	}

	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
	}

	public int getID() {
		return 0;
	}
	
}
