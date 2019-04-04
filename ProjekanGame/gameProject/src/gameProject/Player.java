package gameProject;

public class Player {
	protected int lifePlayer;
	protected Weapone weapon;
	
	public Player(int lifePlayer, Weapone weapon) {
		this.lifePlayer = 100;
		this.weapon = weapon;
	}

	public int getLifePlayer() {
		return lifePlayer;
	}

	public Weapone getWeapon() {
		return weapon;
	}

	public void setLifePlayer(int lifePlayer) {
		this.lifePlayer = lifePlayer;
	}

	public void setWeapon(Weapone weapon) {
		this.weapon = weapon;
	}
	
	public void getAttack(Weapone damage) {
		
	}
	
}
