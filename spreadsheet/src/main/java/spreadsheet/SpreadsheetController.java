package spreadsheet;

public class SpreadsheetController {

    private Spreadsheet spreadsheet;
    private UserInterface userInterface;
    private S2VLoader loader;
    private S2VSaver saver;

    public SpreadsheetController(Spreadsheet spreadsheet) {
        this.spreadsheet = spreadsheet;
        

    }

    public void editCell(Coordinate coordinate, String content) {

        if(this.spreadsheet == null) {
            throw new RuntimeException("No spreadsheet loaded");
        }

        if((coordinate.row < 0 || coordinate.row >= this.spreadsheet.getRowNum()) || (coordinate.col < 0 || coordinate.col >= this.spreadsheet.getColNum()) ) {
            throw new RuntimeException("Invalid coordinate");
        }

        //Falta excepció content de content
        if(content.contains("=")){  //Detectar si es formula
            
        }else if (...){  //Detectar si es numeric
            
        }else{ //Es text

        }

        //referencia a la cela
        this.spreadsheet.getCells()[coordinate.row][coordinate.col].setContent(content);

    }

    public void recalculateReferences(Cell cell) {
       
    }

    public void createSpreadsheet(int rows, int columns, int id) {
        this.spreadsheet = new Spreadsheet(rows, columns, id);        
    }

    public void calculateFormula(Formula formula) {
       
    }

    public void saveSpreadsheet(String path) {
        this.saver.saveSpreadsheet(this.spreadsheet, path);
    }

    public void loadSpreadsheet(String path) {
        this.loader.loadSpreadsheet(path);
    }
    
}
