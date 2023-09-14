package lesson14;

public class MoldovanHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth() {
        return 30;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " My country is " +
                "Moldova. " + "I'm lay " + getCountOfEggsPerMonth()
                + " eggs per month";
    }
}
