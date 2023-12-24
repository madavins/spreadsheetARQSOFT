package spreadsheet;

import java.util.List;

public class Average implements Function{ 
      
    private List<Argument> args;
    
    public Average(List<Argument> args){
        this.args = args;
    }
    
    public List<Argument> getArgs(){
        return args;
    }
    
    public float calculate(){
        return 0;
    }
    
}
