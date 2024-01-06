package spreadsheet;

import java.util.ArrayList;
import java.util.List;

public class Spreadsheet {

    int colNum;
    int rowNum;
    int id;
    Cell[][] cells;

    public Spreadsheet(int colNum, int rowNum, int id) {
        this.rowNum = rowNum;
        this.colNum = colNum;
        this.id = id;
        this.cells = this.generateCells(colNum, rowNum);
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

    private Cell[][] generateCells(int colNum, int rowNum) {
        // Create Matrix
        Cell[][] cells = new Cell[this.colNum][this.rowNum];
        // column name model to indicate how many times a letter has to be repeated;
        // A-Z, AA-ZZ, ...
        String colNameModel = "#";
        char colLetter = 'A';
        for (int i = 0; i < this.colNum; i++) { // Cols
            // first letter is 'A':
            for (int j = 0; j < this.rowNum; j++) { // Rows
                // The column name is the string of the letter
                Cell c = new Cell(colNameModel.replace('#', colLetter), j + 1);
                cells[i][j] = c;
            }
            colLetter = (char) (colLetter + 1);
            if (colLetter > 'Z') {
                colLetter = 'A';
                colNameModel = colNameModel + "#";
            }
        }
        return cells;
    }

    public Cell findCell() {
        return null;
    }

    public Cell findCellbyCoordinate(Coordinate targetCor) { // throws CoordinateOutOfBoundsException
        Cell cell = null;
        for (Cell[] var : this.cells) {
            for (Cell c : var) {
                Coordinate cor = c.getCoordinate();
                if (cor.equals(targetCor)) {
                    cell = c;
                }
            }
        }
        if (cell == null) {
            //throw new CoordinateOutOfBoundsException(targetCor);
        }
        return cell;
    }

    public int[] findIndexOfCell(Cell targetCell)  { //throws CoordinateOutOfBoundsException
        int[] index = new int[2];
        index[0] = 0;
        index[1] = 0;
        for (int i = 0; i < this.colNum; i++) {
            for (int j = 0; j < this.rowNum; j++) {
                if (targetCell.getCoordinate().equals(this.cells[i][j].getCoordinate())) {
                    index[0] = i;
                    index[1] = j;
                    return index;
                }
            }
        }
        throw new IllegalArgumentException();
        //throw new CoordinateOutOfBoundsException();
    }

    public ArrayList<Cell> getRangeCells(String range)  { //throws CoordinateOutOfBoundsException
        ArrayList<Cell> cellRange = new ArrayList<>();
        String firstCoordinate = range.split(":")[0];
        String secondCoordinate = range.split(":")[1];

        // find length of square that forms the range
        int nCols = Math.abs(secondCoordinate.charAt(0) - firstCoordinate.charAt(0));
        int nRows = Math.abs(secondCoordinate.charAt(1) - firstCoordinate.charAt(1));

        // find first and last coordinate
        Coordinate c1 = new Coordinate(Character.toString(firstCoordinate.charAt(0)),
                Integer.parseInt(Character.toString(firstCoordinate.charAt(1))));
        Cell firstCell = findCellbyCoordinate(c1);
        int index[] = this.findIndexOfCell(firstCell);
        for (int i = 0; i <= nCols; i++) {
            for (int j = 0; j <= nRows; j++) {
                Cell c = this.cells[index[0] + i][index[1] + j];
                cellRange.add(c);
            }
        }
        return cellRange;
    }

    public void addContentToCell(Content content, Coordinate cor) { //throws CoordinateOutOfBoundsException
        Cell c = findCellbyCoordinate(cor);
        c.setContent(content);
    }
}
