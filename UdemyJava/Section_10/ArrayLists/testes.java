package Section_10.ArrayLists;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class testes {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Agatha");
        list.add ("Mia");
        list.add("Kaiser");
        list.add("Joui");
        list.add("Arthur");
        list.add("Dante");
        list.add(2, "Liz");

        System.out.println(list.size());
        System.out.println(list);

        System.out.println("----------------------------");

        for (String x : list) {
            System.out.println(x);
        }

        list.remove("Liz");
        list.removeIf(x -> x.charAt(0) == 'K');
        
        System.out.println(list);
        for (String x : list) {
            System.out.println(x);
        }
     
        System.out.println("----------------------------");

        System.out.println("Index do Joui " + list.indexOf("Joui"));
        System.out.println("Index do Kaiser " + list.indexOf("Kaiser"));

        System.out.println("----------------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

        for (String x : result) {
            System.out.println(x);
        }

        System.out.println("----------------------------");

        String name = list.stream().filter( x-> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);

    }
    
}
