package spreadsheet;

public class String implements Content{
    private String value;

    public String(String v){
        this.value=v;
    }

    public String getValue(){
        return this.value;
    }
    
}
