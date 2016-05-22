package SeaFight;

public class Cell {
    private int x;
    private int y;
    private boolean isAlive;
    private boolean isForShip;

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
        this.isAlive=true;
        this.isForShip =false;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    public boolean isForShip() {
        return isForShip;
    }

    public void setForShip() {
        this.isForShip = true;
    }

    public boolean isContainCoordinates(int x,int y){
        return (this.x==x&&this.y==y);
    }

    @Override
    public String toString() {
        return "Cell{" +
                "x=" + x +
                ", y=" + y +
                ", isAlive=" + isAlive +
                '}';
    }
}
