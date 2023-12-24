package spreadsheet;

import java.util.List;

public class Min implements Function{
    
    private List<Argument> args;
    
    public Min(List<Argument> args){
        this.args = args;
    }
    
    public List<Argument> getArgs(){
        return args;
    }
    
    public float calculate(){
        return 0;
    }
}
