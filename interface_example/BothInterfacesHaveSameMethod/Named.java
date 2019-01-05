package interface_example.BothInterfacesHaveSameMethod;

public interface Named {
    default String getName() {
        return "Named";
    }
}

