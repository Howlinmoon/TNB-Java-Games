package javagame;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Menu_original extends BasicGameState {

	public String mouse = "No Input Yet!";
	int xpos = 100;
	int ypos = 100;

	int faceX = 200;
	int faceY = 200;

	Image picture;

	public Menu_original(int state) {

	}

	public void init(GameContainer gc, StateBasedGame sbg)
			throws SlickException {
		picture = new Image("res/lego_me_small.png");
	}

	// 50,50 = x,y
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g)
			throws SlickException {
		
		g.fillOval(75,100,100,100);
		g.drawString("Play Now", 80, 70);
		
		g.drawString(mouse, xpos, 1024 - ypos);
		g.drawString(mouse, 50, 50);

		//g.drawString("Picture Position: "+faceX+", "+faceY, 50,75);

//		// experimenting with creating a border around the picture
//		for (int offset = 0; offset < 10; offset++) {
//			g.setColor(Color.blue);
//			g.drawRect(190 + offset, 120 + offset, 220 - (2 * offset),
//					220 - (2 * offset)); // x,y,width,height
//		}

		// g.drawOval(200,130, 130, 80); // x,y,width,height
		// picture = new Image("res/lego_me_small.png");
		//g.drawImage(picture, faceX, faceY);

	}

	public void update(GameContainer gc, StateBasedGame sbg, int delta)
			throws SlickException {
		// int xpos = Mouse.getX();
		// int ypos = Mouse.getY();
		xpos = Mouse.getX();
		ypos = Mouse.getY();
		mouse = "Mouse X position: " + xpos + ", Y position: " + ypos;

		Input input = gc.getInput();
		
		// check for the mouse cursor in the oval
		// need to make the Y position dynamic depending on the screen height
		if ( (xpos > 75) && (xpos < 175) && (ypos > 821 && ypos < 921)) {
			// now did you click the button?
			if (input.isMouseButtonDown(0)) {
				sbg.enterState(1);
			}
		}
		
		
//		if (input.isKeyDown(Input.KEY_UP)) {
//			faceY -= 1;
//			if (faceY < 0) {
//				faceY = 0;
//			}
//		}
//
//		if (input.isKeyDown(Input.KEY_DOWN)) {
//			faceY += 1;
//			if (faceY > 1023) {
//				faceY = 1023;
//			}
//		}
//
//		if (input.isKeyDown(Input.KEY_RIGHT)) {
//			faceX += 1;
//			if (faceX > 1279) {
//				faceX = 1279;
//			}
//		}
//
//		if (input.isKeyDown(Input.KEY_LEFT)) {
//			faceX -= 1;
//			if (faceX < 0) {
//				faceX = 0;
//			}
//		}

	}

	public int getID() {
		return 0;
	}

}
