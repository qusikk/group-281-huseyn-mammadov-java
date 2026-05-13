package classwork_6;

public class GameCharacter {
	String name;
	int health = 100;
	int level = 1;
	
	public void takeDamage(int damage) {
		this.health = Math.min(0 , this.health - damage);
	}
	public void heal(int amount) {
		this.health = Math.max(100, this.health + amount);
	}
	public boolean isAlive() {
		if(health > 0) {
			return true;
		}
		else {return false;}
	}
	public void levelUp() {
		this.level++;
	}
	
	

}
