package strategy;

public class DefaultStrategyIml implements IStrategy {
    @Override
    public void applyStrategy() {
        System.out.println("Etape Intermediare de l'algorithme avec la strategy par defaut");
    }
}
