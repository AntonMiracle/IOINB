import java.util.Arrays;

/**
 * Created by student on 10.03.2018.
 */
public class Main {
    public static void main(String[] args) {
        Kolejka<String, Integer> kolejka = new Kolejka<>();
        System.out.println(kolejka.isEmpty());
        kolejka.push("Ania", 2);
        kolejka.push("Tana", 3);
        kolejka.push("Misha", 4);
        kolejka.push("Epsilon", 5);
        kolejka.push("A", 6);
        kolejka.push("Ania", 2);
        kolejka.push("An", 3);
        kolejka.push("Bond", 42);
        kolejka.push("Interstellar", 2);
        kolejka.push("Z", 2);
        Kolejka<String, Integer>.Node<String, Integer> node1 = kolejka.new Node<>("ZAnia",2);
        Kolejka<String, Integer>.Node<String, Integer> node2 = kolejka.new Node<>("Ab",3);
        Kolejka<String, Integer>.Node<String, Integer> node3 = kolejka.new Node<>("ZAnia",2);
//        System.out.println(node1.compareTo(node1));
//        System.out.println(node1.compareTo(node2));
//        System.out.println(node1.compareTo(node3));
        System.out.println(kolejka.toString());
        System.out.println(kolejka.pop().toString());
        System.out.println(kolejka.peek().toString());
        System.out.println(kolejka.pop().toString());
        System.out.println(kolejka.isEmpty());
//        System.out.printf(kolejka.toString());
    }
}
