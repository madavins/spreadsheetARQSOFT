package spreadsheet;

import java.util.List;

public class Min extends Function{
    
    private List<Argument> args;
    
    public Min(List<Argument> args){
        this.args = args;
    }
    
    public List<Argument> getArgs(){
        return args;
    }
    
    public float calculateFunction(){
        float min = Float.MAX_VALUE;
        for(Argument arg : this.args){
            if(arg instanceof Function){
                min = Math.min(min, ((Function)arg).calculate());
            }else if(arg instanceof Number){
                min = Math.min(min, ((Number)arg).getValue());
            }else if(arg instanceof Cell){
                //Com es tracta una cela?
                continue;
            }else if(arg instanceof Range){
                for(Cell c : ((Range)arg).getRange()){
                    //Com es tracta una cela?
                    continue;
                }
            }
        }
        return min;
    }
}
