package spreadsheet;

public class Number extends Operand implements Content, Argument {
    private float value;

    public Number(float v){
        this.value=v;
    }

    public float getValue(){
        return this.value;
    }
}
