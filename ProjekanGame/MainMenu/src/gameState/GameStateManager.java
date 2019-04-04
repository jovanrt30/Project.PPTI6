package gameState;

import java.awt.Graphics2D;
import java.util.ArrayList;

public class GameStateManager {
	
	private ArrayList<GameState> gameStates;
	private int currState;
	
	public static final int MENUSTATE = 0;
	
	public GameStateManager() {
		
		gameStates = new ArrayList<GameState>();
		
		currState = MENUSTATE;
		gameStates.add(new MenuState(this));
		
	}
	
	public void setState(int state) {
		currState = state;
		gameStates.get(currState).init();
	}
	
	public void update() {
		gameStates.get(currState).update();
	}
	
	public void draw(Graphics2D g) {
		gameStates.get(currState).draw(g);
	}
	
	public void keyPressed(int k) {
		gameStates.get(currState).keyPressed(k);
	}
	
	public void keyReleased(int k) {
		gameStates.get(currState).keyReleased(k);
	}
	
}
