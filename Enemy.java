public class Enemy extends Character {

    // Constructor
    public Enemy(String setName, String setHometown) {
	super(100, 50, 50); // Scale this later
	name = setName;
	hometown = setHometown;
    }

    // TODO: Take string from lyric array
    public int attack(Character opponent) {
	opponent.lowerHP(20); // Decrease based on rap lyric percentage
	return 20; // Return damage dealt
    }
    
}
