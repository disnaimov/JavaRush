package lesson14;

public class UkrainianHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth() {
        return 30;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " My country is " +
                "Ukraine. " + "I'm lay " + getCountOfEggsPerMonth()
                + " eggs per month";
    }
}
