package spreadsheet;

import java.util.List;

public interface Function {
    List<Argument> getArgs();
    float calculate();
}
