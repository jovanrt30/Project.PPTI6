package gameProject;

public class BombAsWeapon extends Weapone{
	
//	private int bombDamage;
	
	public BombAsWeapon(int normalDamage) {
		super(normalDamage);
//		this.bombDamage = bombDamage;
		// TODO Auto-generated constructor stub
	}

	public int getBombDamage(int normalDamage) {
//		this.bombDamage = 4*super.normalDamage;
		normalDamage *= 4;
		return normalDamage;
	}
	
}
