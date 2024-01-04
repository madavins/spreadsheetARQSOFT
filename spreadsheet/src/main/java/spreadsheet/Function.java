package spreadsheet;

import java.util.List;

public interface Function extends Argument, Operand{
    List<Argument> getArgs();
    float calculate();
}
