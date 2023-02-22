package accetion_pkg;

public class Chara {
	String name;
	int hp;
	
	public void attack() {
		System.out.println("攻撃をした！");
	}

	@Override
	public String toString() {
		return "Chara [name=" + name + ", hp=" + hp + "]";
	}

}
