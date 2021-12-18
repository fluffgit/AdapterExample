package TRENER3.Adapter;


public class ComputerGameAdapter implements PCGame {

    private ComputerGame computerGame;


    @Override
    public String getTitle() {
        return computerGame.getName();

    }

    @Override
    public Integer getPegiAllowedAge() {
        PegiAgeRating pegi = computerGame.getPegiAgeRating();

        switch (pegi) {
            case P3:
                return 3;
            case P7:
                return 7;
            case P12:
                return 12;
            case P16:
                return 16;
            case P18:
                return 18;
            default:
                throw new RuntimeException("Unsupported");
        }

    }

    @Override
    public boolean isTripleAGame() {
        if (computerGame.getBudgetInMillionsOfDollars() >= 50) {
            return true;
        } else return false;
    }

    @Override
    public Requirements getRequirements() {
        return new Requirements(computerGame.getMinimumGpuMemoryInMegabytes() / 1024, computerGame.getDiskSpaceNeededInGB(), computerGame.getRamNeededInGb(), computerGame.getCoreSpeedInGhz(), computerGame.getCoresNeeded());
    }

    public ComputerGameAdapter(ComputerGame computerGame) {
        this.computerGame = computerGame;
    }
}
