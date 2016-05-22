package SeaFight;

public class Field {
    private final int sizeOfField=10;
    private Cell [][] cellsOfField;
    private final int[] shipsCount={4,3,2,1};          //size <=> index-1 = колличество возможных кораблей
    private Ship[] shipsOfField=new Ship[10];
    private int shipId=0;

    public Field() {
        this.cellsOfField=new Cell[sizeOfField][sizeOfField];
        for (int i=0;i<cellsOfField.length;i++){
            for (int j=0;j<cellsOfField[i].length;j++){
                cellsOfField[i][j]=new Cell(i,j);
            }
        }
    }

    public void addShip(int size, int xBegin, int yBegin, boolean isHorizontal){
        shipsOfField[shipId++]=new Ship(makeShipBody(size,xBegin,yBegin,isHorizontal));

    }

    private Cell[] makeShipBody(int shipSize, int xBegin, int yBegin, boolean isHorizontal){
        Cell[] cellsForNewShip=new Cell[shipSize];
        if (isHorizontal){
            for (int i=0; i<shipSize; i++){
                Cell currentCell=cellsOfField[xBegin][yBegin+i];
                currentCell.setForShip();
                cellsForNewShip[i]=currentCell;
            }
            return cellsForNewShip;
        }else {
            for (int i=0; i<shipSize; i++){
                Cell currentCell=cellsOfField[xBegin+i][yBegin];
                currentCell.setForShip();
                cellsForNewShip[i]=currentCell;
            }
            return cellsForNewShip;
        }
    }

    public void printField(){
        System.out.println("------------------------------------------");
        for (Cell i[]:cellsOfField){
            for (Cell j:i){
                if (j.isAlive()){
                    if (j.isForShip()){
                        System.out.print("■ ");
                    }else {
                        System.out.print("□ ");
                    }
                }else {
                    if (j.isForShip()){
                        System.out.print("☒");
                    }else {
                        System.out.print("•");
                    }
                }
            }
            System.out.println();
        }
        System.out.println("------------------------------------------");
    }
    /*
    * System.out.print("□ ");
    * System.out.print("■ ");
    * System.out.print("☒");
    * System.out.print("•");
    * System.out.print("◙ ");
    * */

}
