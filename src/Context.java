import strategy.DefaultStrategyIml;
import strategy.IStrategy;

public class Context {

    private IStrategy strategy;


    public Context() {
        this.strategy = new DefaultStrategyIml();
    }

    public void process(){
        System.out.println("Etape 1 de l'algorithme");
        strategy.applyStrategy();
        System.out.println("Etape Finale de l'algorithme");

    }
    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }
}
