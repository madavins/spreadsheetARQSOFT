package spreadsheet;

public abstract class Operator implements FormulaComponent {
    
    private String type;

    public Operator(String type) {
        this.type = type;
    }

    public Operator getOperator() {
        return this;
    }
    
}
