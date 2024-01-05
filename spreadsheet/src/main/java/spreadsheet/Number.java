package spreadsheet;

public class Number extends Content implements Argument, Operand {

    public Number(float v){
        super(v);
    }

    public Float getValue(){
        String s = super.getValue().toString();
        return Float.valueOf(s);
    }

    public void setValue(Float v){
        super.setValue(v);
    }
}
