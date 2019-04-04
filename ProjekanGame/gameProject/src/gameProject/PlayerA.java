package gameProject;
import gameProject.Weapone;

public class PlayerA extends Player{

	public PlayerA(int lifePlayer, Weapone weapon) {
		super(lifePlayer, weapon);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getAttack(Weapone damage) {
		int temp = damage.normalDamage;
		setLifePlayer(getLifePlayer() - temp);
	}
	
	
	
	

//	private int lifePlayerA;
//	
//	public PlayerA(int lifePlayer, Weapone weapon) {
//		super(lifePlayer, weapon);
//		this.lifePlayerA = super.lifePlayer;
//	}
//
//	public int getLifePlayerA() {
//		return lifePlayerA-;
//	}
//
//	public void setLifePlayerA(int lifePlayerA) {
//		this.lifePlayerA = lifePlayerA;
//	}
	
	
	
	
}
