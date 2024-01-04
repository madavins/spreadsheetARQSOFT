package spreadsheet;

public class Number implements Argument, Content, Operand {
    private float value;

    public Number(float v){
        this.value=v;
    }

    public float getValue(){
        return this.value;
    }

    public void setValue(float v){
        this.value=v;
    }
}
