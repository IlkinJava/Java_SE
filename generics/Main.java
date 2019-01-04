package generics;

public class Main {
    public static void main(String[] args) {
        Body body = new Body();
        SmallHead smallHead = new SmallHead();
        MediumHead mediumHead = new MediumHead();
        BigHead bigHead = new BigHead();

        Robot<SmallHead> smallHeadRobot = new Robot<>(body, smallHead);
        System.out.println(smallHeadRobot.getHead().skill());

        Robot<MediumHead> mediumHeadRobot = new Robot<>(body, mediumHead);
        System.out.println(mediumHeadRobot.getHead().skill());

        Robot<BigHead> bigHeadRobot = new Robot<>(body, bigHead);
        System.out.println(bigHeadRobot.getHead().skill());
    }
}
