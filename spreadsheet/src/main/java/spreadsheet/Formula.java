package spreadsheet;

public class Formula implements Content{
    private String expression;
    private float value;

    public Formula(String s, float v){
        this.expression=s;
        this.value=v;
    }

    public float getValue(){
        return this.value;
    }

    public void setValue(float v){
        this.value=v;
    }
}
