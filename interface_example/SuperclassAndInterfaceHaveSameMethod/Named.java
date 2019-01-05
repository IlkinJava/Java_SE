package interface_example.SuperclassAndInterfaceHaveSameMethod;

public interface Named {
    default String getName() {
        return "Interface method";
    }
}
