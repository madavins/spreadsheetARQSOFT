package spreadsheet;

public class Number implements Content{
    private float value;

    public Number(float v){
        this.value=v;
    }

    public float getValue(){
        return this.value;
    }
}
