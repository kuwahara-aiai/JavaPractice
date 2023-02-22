package accetion_pkg;

public class Magic extends Chara {
	
	int mp;
	
	@Override
	public void attack() {
		System.out.println("魔法で攻撃をした！");
	}

	@Override
	public String toString() {
		return "Magic [mp=" + mp + ", name=" + name + ", hp=" + hp + "]";
	}


}
