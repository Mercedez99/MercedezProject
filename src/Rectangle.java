import processing.core.PApplet;
import processing.core.PConstants;

public class Rectangle extends GameObject {

    public Rectangle(PApplet pApplet,int x, int y) {
        super(pApplet, x,y);

    }

    @Override
    void update() {
        parent.fill(102);
        parent.rectMode(PConstants.CORNER);
        parent.rect(renderPoint.getX(),renderPoint.getY(),50,50);
    }

}
