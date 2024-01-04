package spreadsheet;

import java.util.ArrayList;
import java.util.List;

public class Cell {

    private Coordinate coordinate;
    private List<Cell> refCells;
    private Content content;

    public Cell(int rowNum, int colNum){
        this.coordinate = new Coordinate(rowNum, colNum);
        this.content = null;
        this.refCells = new ArrayList<Cell>();
    }

    public Coordinate getCoordinate(){
        return coordinate;
    }

    public void setCoordinate(Coordinate coordinate){
        this.coordinate = coordinate;
    }

    public void setContent(Content content){
        this.content = content;
    }

    public Content getContent(){
        return content;
    }

    public List<Cell> getRefCells(){
        return refCells;
    }

    public void addRefCell(Cell cell){
        refCells.add(cell);
    }

    public void removeRefCell(Cell cell){
        refCells.remove(cell);
    }    
}
