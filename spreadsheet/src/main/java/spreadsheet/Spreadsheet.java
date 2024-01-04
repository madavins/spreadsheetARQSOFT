package spreadsheet;

import java.util.List;

public class Spreadsheet {

    int rowNum;
    int colNum;
    int id;
    Cell[][] cells;

    public Spreadsheet(int rowNum, int colNum, int id){
        this.rowNum = rowNum;
        this.colNum = colNum;
        this.id = id;
        this.cells = new Cell[rowNum][colNum];

        for(int i = 0; i < rowNum; i++){
            for(int j = 0; j < colNum; j++){
                Cell cell = new Cell(i, j);
                cells[i][j] = cell;
            }
        }
    }

    public Cell[][] getCells() {
        return cells;
    }

    public Cell getCell(int row, int col) {
        return cells[row][col];
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
