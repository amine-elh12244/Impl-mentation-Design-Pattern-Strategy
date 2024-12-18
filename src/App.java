import strategy.IStrategy;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Context context = new Context();
        boolean fin = false;
        Scanner scanner = new Scanner(System.in);

        while (!fin) {
            System.out.print("Donner la stratégie : ");
            String strategyClassName = scanner.nextLine();
            IStrategy strategy;

            try {
                // Chargement dynamique de la stratégie
                strategy = (IStrategy) Class.forName("strategy." + strategyClassName).newInstance();
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
                // En cas d'erreur, utiliser la stratégie par défaut
                System.out.println("Stratégie non reconnue. Utilisation de la stratégie par défaut.");
                strategy = new strategy.DefaultStrategyIml();
            }

            context.setStrategy(strategy);
            context.process();

            System.out.print("Voulez-vous continuer ? (oui/non) : ");
            String reponse = scanner.nextLine();
            fin = reponse.equalsIgnoreCase("non");
        }
        scanner.close();
    }
}
