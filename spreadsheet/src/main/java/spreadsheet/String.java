package spreadsheet;

public class Text implements Content{
    private String value;

    public Text(String v){
        this.value=v;
    }

    public String getValue(){
        return this.value;
    }

    public static Object valueOf(String value2) {
        return null;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
