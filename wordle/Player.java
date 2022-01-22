public class Player {
    private int lives;
    
    public Player() {
        lives = 6;
    }
    
    public boolean hasLives() {
        return lives > 0;
    }
    
    public void loseLife() {
        lives -= 1;
    }
}