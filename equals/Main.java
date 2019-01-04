package equals;

public class Main {
    public static void main(String[] args) {
        /**
         * Случай если в классе Human мы переопределили equals() hashcode()
         */
        Human human = new Human("john");
        Human human1 = new Human("john");
        Human human2 = human1;
        System.out.println(human.equals(human1));//true ==> т.к equals() проверяет значение
        System.out.println(human == human1);//false ==> т.к (==) проверяет ссылки
        System.out.println(human2 == human1);//true ==> т.к oни oбa ссылаются нa oдин и тoт жe oбъект
        /**
         * Случай если в классе Human мы не переопределили equals() hashcode()
         *   тo будет вызыватся equals() от
         *          глобального супер класса Object
         *         который будет проверять  ссылки и тогда =>
         */

        System.out.println(human.equals(human1));//false ==> т.к проверяет ссылки

    }
}
