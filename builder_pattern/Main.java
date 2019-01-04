package builder_pattern;

public class Main {
    public static void main(String[] args) {
        NutritionFacts cocaCola = new NutritionFacts.Builder(240, 8).
                calories(200).fat(14).sodium(48).build();
        System.out.println(cocaCola);

    }
}
