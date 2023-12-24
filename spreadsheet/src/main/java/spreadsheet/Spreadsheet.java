package spreadsheet;

import java.util.List;

public class Spreadsheet {

    int rowNum;
    int colNum;
    int id;
    List<Cell> cells;

    public Spreadsheet(int rowNum, int colNum, int id){
        this.rowNum = rowNum;
        this.colNum = colNum;
        this.id = id;

        for(int i = 0; i < rowNum; i++){
            for(int j = 0; j < colNum; j++){
                Cell cell = new Cell(i, j);
                cells.add(cell);
            }
        }

    }

    public List<Cell> getCells() {
        return cells;
    }

    public int getId() {
        return id;
    }

    public int getColNum() {
        return colNum;
    }

    public int getRowNum() {
        return rowNum;
    }
}
