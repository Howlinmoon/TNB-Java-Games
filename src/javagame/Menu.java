package javagame;

import org.lwjgl.input.Mouse;
import  org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Menu extends BasicGameState {
	
	public String mouse = "No Input Yet!";
	int xpos = 100;
	int ypos = 100;
	public Menu(int state) {
		
	}
	
	public void init(GameContainer gc, StateBasedGame sbg)  throws SlickException {
		
	}
	
	// 50,50 = x,y
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
		g.drawString(mouse,xpos,1024 - ypos);
		g.drawString(mouse,50,50);

		// experimenting with creating a border around the picture
		for (int offset = 0; offset < 10; offset++) {
			g.setColor(Color.blue);
			g.drawRect(190+offset, 120+offset, 220- (2 * offset), 220 -  (2 * offset) );  // x,y,width,height
		}		
		
		//g.drawOval(200,130, 130, 80); // x,y,width,height
		Image picture = new Image("res/lego_me_small.png");
		g.drawImage(picture, 200,130);
		
		
	}

	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
//		int xpos = Mouse.getX();
//		int ypos = Mouse.getY();
		xpos = Mouse.getX();
		ypos = Mouse.getY();
		mouse = "Mouse X position: "+xpos+", Y position: "+ypos;
	}

	public int getID() {
		return 0;
	}
	
}
