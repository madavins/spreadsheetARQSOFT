package spreadsheet;

public class Coordinate {

    int row;
    int col;

    public Coordinate(int row, int col){
        this.row = row;
        this.col = col;
    }

    public int getRowNum(){
        return row;
    }

    public int getColNum(){
        return col;
    }

    public void setRow(int row){
        this.row = row;
    }

    public void setCol(int col){
        this.col = col;
    }
    
}
