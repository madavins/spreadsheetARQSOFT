package spreadsheet;

import java.util.List;

public class Average extends Function{ 
      
    private List<Argument> args;
    
    public Average(List<Argument> args){
        this.args = args;
    }
    
    public List<Argument> getArgs(){
        return args;
    }
    
    public float calculateFunction(){
        float sum = 0;
        int count = 0;
        for(Argument arg : this.args){
            if(arg instanceof Function){
                sum += ((Function)arg).calculate();
                count++;
            }else if(arg instanceof Number){
                sum += ((Number)arg).getValue();
                count++;
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
        return sum/count;
    }
    
}
