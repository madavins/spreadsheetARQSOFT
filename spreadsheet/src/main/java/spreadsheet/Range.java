package spreadsheet;

import java.util.List;

public class Range {

    Coordinate start;
    Coordinate end;
    List<Cell> cellsRange;

    public Range(Coordinate start, Coordinate end){
        this.start = start;
        this.end = end;
    }

    public Coordinate getStart(){
        return start;
    }

    public Coordinate getEnd(){
        return end;
    }

    public void setStart(Coordinate start){
        this.start = start;
    }

    public void setEnd(Coordinate end){
        this.end = end;
    }

    public List<Cell> getRange(){
        return cellsRange;
    }
    
}
