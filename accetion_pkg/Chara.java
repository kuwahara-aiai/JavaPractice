package accetion_pkg;

public class Chara  implements IntTest{
	String name;
	int hp;
	int exp;
	
	public void attack() {
		System.out.println("攻撃をした！");
	}
	@Override
	public int exp() {
		return 1000;
	}
	@Override
	public String toString() {
		return "Chara [name=" + name + ", hp=" + hp + ", exp=" + exp + "]";
	}


}
