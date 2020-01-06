import processing.core.PApplet;

public class Main extends PApplet {

    private TestGame testGame;

    public static void main(String[] args) {
       PApplet.main("Main");
    }

    @Override
    public void settings() {
        size(800, 800);
    }


    public void setup() {
        background(0);
        noStroke();
        fill(102);
        testGame = new TestGame(this);
        testGame.startGame();
    }


    public void keyPressed() {
        testGame.keyPressed();
    }

    //called every single frame to update the game
    //this is where your game loop goes
    @Override
    public void draw() {
        background(0);
        testGame.updateGame();

    }



}
