package TRENER3;

import TRENER3.Adapter.ComputerGame;
import TRENER3.Adapter.ComputerGameAdapter;
import TRENER3.Adapter.PCGame;
import TRENER3.Adapter.PegiAgeRating;

public class PCGameUsage {
    public static void main(String[] args) {
        ComputerGame computerGame = new ComputerGame("Game1", PegiAgeRating.P12, 50.0, 8, 60, 4, 4, 3.3);

        PCGame pcGame = new ComputerGameAdapter(computerGame);
        System.out.println(pcGame.getTitle());
        System.out.println(pcGame.getPegiAllowedAge());
        System.out.println(pcGame.isTripleAGame());

    }
}
