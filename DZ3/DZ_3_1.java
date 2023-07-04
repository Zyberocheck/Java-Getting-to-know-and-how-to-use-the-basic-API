import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class DZ_3_1 {
    public static void main(String[] args) {
        planetsCounter(5);

    }

    static void planetsCounter(int n) {
        List<String> listPlanets = List.of("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus",
                "Neptune");
        List<String> randPlanets = new ArrayList<String>(n);
        int[] counts = new int[listPlanets.size()];

        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            randPlanets.add(listPlanets.get(rand.nextInt(listPlanets.size())));
            System.out.print(randPlanets.get(i) + " ");
            counts[listPlanets.indexOf(randPlanets.get(i))]++;

        }
        System.out.println();

        Set<String> unick = new LinkedHashSet<>(randPlanets);

        List<String> unickArray = new ArrayList<>(unick); 


        for (String planet : unickArray) {
            System.out.print(planet + " ");
        }
    }
     

}
