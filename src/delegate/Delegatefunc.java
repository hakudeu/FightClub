package delegate;

import java.util.function.Function;

public class Delegatefunc {
    public String ExecuteFunc(Function<String, String> delegatedFunction , String strParam) {

        return delegatedFunction.apply(strParam);
    };

}
