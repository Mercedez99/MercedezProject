import processing.core.PApplet;

import java.util.ArrayList;

public class GameManager {
    private PApplet parent;
    private ArrayList<GameObject> objectsOnScreen;
    private Rectangle player1;
    private Rectangle player2;
    private PlayerController playerController;


    public GameManager(PApplet parent) {
        this.parent = parent;
        objectsOnScreen = new ArrayList<>();
    }

    public void startLevel() {
        player1 = new Rectangle(parent,40,40);
        player2 = new Rectangle(parent,200,200);
        objectsOnScreen.add(player1);
        objectsOnScreen.add(player2);

        playerController = new PlayerController(parent,player1,player2);

    }

    public void updateGame() {
        for(GameObject gameObject: objectsOnScreen){
            gameObject.update();
        }
    }

    public void keyPressed() {
        playerController.checkKeyPressed();
    }
}
