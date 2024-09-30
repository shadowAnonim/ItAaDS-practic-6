public class Circle implements Movable{
    private int radius;
    private Point center;

    public Circle(int radius, int x, int y, int xSpeed, int ySpeed) {
        this.radius = radius;
        this.center = new Point(x, y, xSpeed, ySpeed);
    }

    @Override
    public void MoveUp() {
        center.MoveUp();
    }

    @Override
    public void MoveDown() {
        center.MoveDown();
    }

    @Override
    public void MoveLeft() {
        center.MoveLeft();
    }

    @Override
    public void MoveRight() {
        center.MoveRight();
    }

    @Override
    public String toString() {
        return "Circle: Center: " + center + " Radius: " + radius;
    }
}
