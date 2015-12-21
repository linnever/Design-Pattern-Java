package strategy.main;

/**
 * Created by never on 12/21/2015.
 */
public class operationMultiply implements strategy {
    @Override
    public int doOperation(int num1, int num2){
        return num1 * num2;
    }
}
