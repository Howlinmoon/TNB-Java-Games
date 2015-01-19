package javagame;

import  org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Play_original extends BasicGameState {
	public Play_original(int state) {
		
	}
	
	public void init(GameContainer gc, StateBasedGame sbg)  throws SlickException {
		
	}
	
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
		g.drawString("This is the play State", 100, 100);
	}

	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
		
	}

	public int getID() {
		return 1;
	}
	
}
