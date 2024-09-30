public class Rectangle implements Movable{
    private Point topLeft;
    private Point bottomRight;

    public Rectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        topLeft = new Point(x1, y1, xSpeed, ySpeed);
        bottomRight = new Point(x1, y1, xSpeed, ySpeed);
    }

    @Override
    public void MoveUp() {
        topLeft.MoveUp();
        bottomRight.MoveUp();
    }

    @Override
    public void MoveDown() {
        topLeft.MoveDown();
        bottomRight.MoveDown();
    }

    @Override
    public void MoveLeft() {
        topLeft.MoveLeft();
        bottomRight.MoveLeft();
    }

    @Override
    public void MoveRight() {
        topLeft.MoveLeft();
        bottomRight.MoveRight();
    }

    @Override
    public String toString() {
        return "Rectangle - Pos: " +
                new Point(
                        (topLeft.x + bottomRight.x) / 2,
                        (topLeft.y + bottomRight.y) / 2,
                        0, 0);
    }
}
