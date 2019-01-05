package interface_example.BothInterfacesHaveSameMethod;
/**
 * 1.Если у нас класс имплементит 2 интерфейса с одним и тем же методом(default),
 * то решение конфликта ==> В классе переопределить этот метод как показано ниже
 * 2.Если же один из методов без реализации то никакого конфликта не возникает
 * нужно либо реализовать метод или же объявить класс и метод abstract
 */
public class Student implements Person, Named {
    @Override
    public String getName() {
        return Person.super.getName();
    }
}
