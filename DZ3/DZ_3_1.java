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
        int[] count = new int[listPlanets.size()];

        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            randPlanets.add(listPlanets.get(rand.nextInt(listPlanets.size())));
            System.out.print(randPlanets.get(i) + " "); // Выводим список рандомных и возможно повторяющихся элементов
            counts[listPlanets.indexOf(randPlanets.get(i))]++;
        }
        
        System.out.println();

        Set<String> unick = new LinkedHashSet<>(randPlanets); // С помощью сет создаем уникальную коллекцию

        List<String> unickArray = new ArrayList<>(unick); // Создаем список из уникальных элементов

        for (int i = 0; i < unickArray.size(); i++) {
                count[listPlanets.indexOf(unickArray.get(i))]++; // Создаем новый массив с i
        }

        for (String planet : unickArray) {
            System.out.print(planet + " "); // Выводим список с убранными повторяющимися элементами
        }

        System.out.println();

        for (int i = 0; i < count.length; i++) 
            System.out.printf("%s - %s\n", listPlanets.get(i), count[i]); // выводим весь список элементов и количество повторений этих элементов из списка unickArray
    }
     

}
