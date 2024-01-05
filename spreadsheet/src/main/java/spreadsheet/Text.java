package spreadsheet;

public class Text extends Content{

    public Text(String v){
        super(v);
    }

    public String getValue(){
        return super.getValue().toString();
    }

    public static Object valueOf(String value2) {
        return null;
    }

    public void setValue(String value) {
        super.setValue(value);
    }

}
