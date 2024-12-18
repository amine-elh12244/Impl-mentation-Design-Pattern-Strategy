package strategy;

public class StrategyImpl1 implements IStrategy {
    @Override
    public void applyStrategy() {
        System.out.println("Etape Intermediare de l'algorithme avec la strategy  1");
    }
}
