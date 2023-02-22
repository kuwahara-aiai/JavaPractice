package chara_pkg;

public class Chara {
	private String job;
	private String name;
	private int hp;

	//コンストラクタ 
	//オブジェクトを作成した瞬間自動で実行される
	//ただ、あくまでも稼働するのはMainメソッド
	public Chara() {
		this.job = "勇者";
		this.name = "アイ";
		this.hp = 150;
	}

	//ゲッターとセッター
	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getName() {
		return this.name;
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

	//toStringメソッド
	@Override
	public String toString() {
		return "Chara [name=" + name + "]";
	}
	

}
