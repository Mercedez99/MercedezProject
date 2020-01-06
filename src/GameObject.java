import processing.core.PApplet;

public abstract class GameObject {
    protected PApplet parent;
    Point renderPoint;

    public GameObject(PApplet parent,int x,int y ) {
        this.parent = parent;
        this.renderPoint = new Point(x,y);
    }

    public Point getRenderPoint() {
        return renderPoint;
    }

    abstract void update();
}
