package spreadsheet;

public class Coordinate {

    String col;
    int row;
    
    public Coordinate(String col, int row){
        this.col = col;
        this.row = row;
    }

    public int getRowNum(){
        return row;
    }

    public String getColNum(){
        return col;
    }

    public void setRow(int row){
        this.row = row;
    }

    public void setCol(String col){
        this.col = col;
    }
    
}
