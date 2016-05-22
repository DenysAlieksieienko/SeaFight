package SeaFight;

public class Game {
    public static void main(String[] args) {
        Field f=new Field();
        f.printField();
        f.addShip(1,1,1,false);
        f.printField();
    }
}
