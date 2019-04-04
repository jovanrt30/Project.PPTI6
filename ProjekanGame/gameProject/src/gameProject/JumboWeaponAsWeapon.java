package gameProject;

public class JumboWeaponAsWeapon extends Weapone{

	public JumboWeaponAsWeapon(int normalDamage) {
		super(normalDamage);
		// TODO Auto-generated constructor stub
	}

	public int getJumboDamage(int normalDamage) {
		normalDamage *= 2;
		return normalDamage;
	}

	
}
