package spreadsheet;

import java.util.List;

public class Formula extends Content{
    private String expression;
    private List<FormulaComponent> components;  

    public Formula(String s, float v){
        super(v);
        this.expression=s;
    }

    public String getValue(){
        return this.expression;
    }

    public void setValue(float v){
        super.setValue(v);
    }
}
