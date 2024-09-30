public class Point implements Movable{
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public Point(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void MoveUp() {
        y += ySpeed;
    }

    @Override
    public void MoveDown() {
        y -= ySpeed;
    }

    @Override
    public void MoveLeft() {
        x -= xSpeed;
    }

    @Override
    public void MoveRight() {
        x += xSpeed;
    }

    @Override
    public String toString() {
        return "Point (" + x + ", " + y + ")";
    }
}
