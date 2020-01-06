import processing.core.PApplet;

public class TestGame {
    private PApplet pApplet;
    private GameManager gameManager;

    public TestGame(PApplet pApplet) {
        this.pApplet = pApplet;
    }

    public void startGame() {
        gameManager = new GameManager(pApplet);
        gameManager.startLevel();
    }
    public void updateGame(){
        gameManager.updateGame();
    }

    public void keyPressed() {
        gameManager.keyPressed();
    }
}
