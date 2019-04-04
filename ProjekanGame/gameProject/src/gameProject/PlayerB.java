package gameProject;

public class PlayerB extends Player{

	public PlayerB(int lifePlayer, Weapone weapon) {
		super(lifePlayer, weapon);
		// TODO Auto-generated constructor stub
	}
	
	public void getAttack(Weapone damage) {
		int temp = damage.normalDamage;
		setLifePlayer(getLifePlayer() - temp);
	}
	
}
