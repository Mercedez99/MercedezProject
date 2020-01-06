import processing.core.PApplet;

public class PlayerController {
    private GameObject player1;
    private GameObject player2;
    private PApplet pApplet;

    public PlayerController(PApplet pApplet, GameObject player1, GameObject player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.pApplet = pApplet;
    }

    public void checkKeyPressed() {
        //player 1 key checking, only one key at a time for each player
        switch (pApplet.key){
            case 'a':{
                int newXPosition = player1.getRenderPoint().getX() - 10;
                player1.getRenderPoint().setX(newXPosition);
                break;
            }
            case 'd':{
                int newXPosition = player1.getRenderPoint().getX() + 10;
                player1.getRenderPoint().setX(newXPosition);
                break;
            }
            case 'w':{
                int newYPosition = player1.getRenderPoint().getY() - 10;
                player1.getRenderPoint().setY(newYPosition);
                break;
            }
            case 's':{
                int newYPosition = player1.getRenderPoint().getY() + 10;
                player1.getRenderPoint().setY(newYPosition);
                break;
            }
        }
        //player 2 checking, only one key at a time for each player
        switch (pApplet.keyCode){
            case 37:{
                int newXPosition = player2.getRenderPoint().getX() - 10;
                player2.getRenderPoint().setX(newXPosition);
                break;
            }
            case 39:{
                int newXPosition = player2.getRenderPoint().getX() + 10;
                player2.getRenderPoint().setX(newXPosition);
                break;
            }
            case 38:{
                int newYPosition = player2.getRenderPoint().getY() - 10;
                player2.getRenderPoint().setY(newYPosition);
                break;
            }
            case 40:{
                int newYPosition = player2.getRenderPoint().getY() + 10;
                player2.getRenderPoint().setY(newYPosition);
                break;
            }
        }

    }
}
