package javaa6_pkg;

public class Chara {
	String name;
	int hp;

	public Chara(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}

	@Override
	public String toString() {
		return "Chara [name=" + name + ", hp=" + hp + "]";
	}
}