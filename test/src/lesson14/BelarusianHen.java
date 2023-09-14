package lesson14;

public class BelarusianHen extends Hen{
    @Override
    public int getCountOfEggsPerMonth() {
        return 35;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " My country is " +
                "Belarus. " + "I'm lay " + getCountOfEggsPerMonth()
                + " eggs per month";
    }
}
