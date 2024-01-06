package spreadsheet;

public class Content {
    private Object value;

    public Content(Object v){
        this.value=v;
    }

    public Object getValue(){
        return this.value;
    }

    public void setValue(Object v){
        this.value=v;
    }
}
