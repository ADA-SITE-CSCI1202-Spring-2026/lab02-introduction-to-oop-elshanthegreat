package week03;

public class Point {
    private float x;
    private float y;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }
    
    public float getX() {
        return this.x;
    }
    
    public float getY() {
        return this.y;
    }
    
    public void setX(float x) {
        this.x = x;
    }
    
    public void setY(float y) {
        this.y = y;
    }
    
    public void translate(float dx, float dy) {
        this.x += dx;
        this.y += dy;
    }
    
    public double distanceTo(Point p) {
        float dx = this.x - p.x;
        float dy = this.y - p.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}