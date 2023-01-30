public abstract class Character {

    protected String name;
    protected String hometown;
    protected int maxHP;
    protected int HP;
    protected int defense;
    protected int attack;

    // Overloaded constructor
    public Character(int setHP, int setDefense, int setAttack) {
	HP = setHP;
	maxHP = setHP;
	defense = setDefense;
	attack = setAttack;
    }
    
    // Check if player is alive
    public boolean isAlive() {
	return HP > 0;
    }

    // Get name
    public String getName() {
        return name;
    }

    // Get hometown
    public String getHometown() {
	return hometown;
    }

    // Get HP
    public int getHP() {
	if (HP < 0) {
	    HP = 0;
	}
	return HP;
    }
    
    // Get defense
    public int getDefense() {
        return defense;
    }

    // Get attack
    public int getAttack(){
	return attack;
    }

    // Set HP
    public void setHP(int maxHP) {
	HP = maxHP;
    }
    
    // Lowers HP
    public int lowerHP(int hp) {
	HP -= hp;
	return HP;
    }

    // Add HP
    public int addHP(int hp) {
	HP = hp;
	// Set maxHP to include upgraded HP
        maxHP += hp;
	return HP;
    }
    
    // Set defense
    public int addDefense(int def) {
	defense += def;
	return defense;
    }

    // Set attack
    public int addAttack(int atk) {
	attack += atk;
	return attack;
    }
    
    // Attack
    public abstract int attack(Character opponent);

}
