package interface_example.BothInterfacesHaveSameMethod;

public interface Person {
    default String getName() {
        return " Person ";
    }
}
