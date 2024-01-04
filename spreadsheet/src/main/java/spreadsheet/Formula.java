package spreadsheet;

import java.util.List;

public class Formula implements Content{
    private String expression;
    private float value;
    private List<FormulaComponent> components;  

    public Formula(String s, float v){
        this.expression=s;
        this.value=v;
    }

    public String getValue(){
        return this.expression;
    }

    public void setValue(float v){
        this.value=v;
    }
}
