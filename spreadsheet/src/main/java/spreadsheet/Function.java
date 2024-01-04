package spreadsheet;

import java.util.ArrayList;
import java.util.List;

public abstract class Function implements Operand, Argument{
    private List<Argument> arguments;
    private float value;

    public Function(ArrayList<Argument> arguments) {
        this.arguments = arguments;
        this.value = 0;
    }

    public Function() {
        this.arguments = null;
        this.value = 0;
    }
    
    public List<Argument> getArguments(){
        return this.arguments;
    }
    
    public void setArguments(List<Argument> arguments){
        this.arguments = arguments;
    }

    public float calculate(){
        if(this.value==0){
            this.value = this.calculateFunction();
        }
        return this.value;
    }
    
    public abstract float calculateFunction()throws IllegalArgumentException;
}

