package SeaFight;

public class Ship {
    private int size;
    private Cell[] shipBody;
    private boolean isShipAlive;

    public Ship(Cell[] body){
        this.shipBody =body;
        size=body.length;
    }

    public boolean isContain(int x,int y){
        boolean isContain=false;
        for (Cell c: shipBody){
            if (c.isContainCoordinates(x,y)){
                isContain=true;
                break;
            }
        }
        return isContain;
    }



}
