package lesson14;

public class RussianHen extends Hen{
    @Override
    public int getCountOfEggsPerMonth() {
        return 40;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " My country is " +
                "Russia. " + "I'm lay " + getCountOfEggsPerMonth()
                + " eggs per month";
    }
}
