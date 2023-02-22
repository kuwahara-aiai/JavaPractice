package chara_pkg;

public class Enemy {
	private String name;
	private int hp;
	
	public Enemy(){
		this.name = "魔王";
		this.hp = 10000;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}
	

}
