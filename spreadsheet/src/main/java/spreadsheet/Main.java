package spreadsheet;

public class Main {
    public static void main(String[] args){
        Spreadsheet spreadsheet = new Spreadsheet(10, 10, 1);
        System.out.println("Spreadsheet ID: " + spreadsheet.getId());
        System.out.println("Spreadsheet Row Number: " + spreadsheet.getRowNum());
        System.out.println("Spreadsheet Column Number: " + spreadsheet.getColNum());
        System.out.println("Spreadsheet Cells: " + spreadsheet.getCells());
    }
}