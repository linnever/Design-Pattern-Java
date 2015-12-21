package strategy.main;

/**
 * Created by never on 12/21/2015.
 */
public class context {
    private strategy strategy;
    public context(strategy strategy){
        this.strategy=strategy;
    }
    public int executeStrategy(int num1,int num2){
        return strategy.doOperation(num1, num2);
    }
}
