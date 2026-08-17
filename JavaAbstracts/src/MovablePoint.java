public class MovablePoint implements Movable {
    private int x, y, xSpeed, ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getXSpeed() {
        return this.xSpeed;
    }

    public void setXSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }

    public int getYSpeed() {
        return this.ySpeed;
    }

    public void setYSpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "(" + this.getX() + ", " + this.getY() + ") speed = (" + this.getXSpeed() + ", " + this.getYSpeed() + ")";
    }

    @Override
    public void moveUp() {
        this.setY(this.getY() - this.getYSpeed());
    }

    @Override
    public void moveDown() {
        this.setY(this.getY() + this.getYSpeed());
    }

    @Override
    public void moveLeft() {
        this.setX(this.getX() - this.getXSpeed());
    }

    @Override
    public void moveRight() {
        this.setX(this.getX() + this.getXSpeed());
    }
}
