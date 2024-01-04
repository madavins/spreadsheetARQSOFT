package spreadsheet;

import java.util.List;

public class Max extends Function{

    private List<Argument> args;
    
    public Max(List<Argument> args){
        this.args = args;
    }
    
    public List<Argument> getArgs(){
        return args;
    }
    
    public float calculateFunction(){
        float max = 0;
        for(Argument arg : this.args){
            if(arg instanceof Function){
                float aux = ((Function)arg).calculate();
                if(aux > max){
                    max = aux;
                }
            }else if(arg instanceof Number){
                float aux = ((Number)arg).getValue();
                if(aux > max){
                    max = aux;
                }
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
        
        return max;
    }
    
}
