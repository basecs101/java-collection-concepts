import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> guestList = new ArrayList<>();

        guestList.add("Tom");
        guestList.add("Bob");
        guestList.add("Mike");
        guestList.add("Peter");

        guestList.forEach(name -> System.out.println(name));

        System.out.println("Element at 0th index : "+ guestList.get(0));

        System.out.println("Remove element from 0th index : "+ guestList.remove(0));

        guestList.forEach(name -> System.out.println(name));

        Stream<String> stringStream = guestList.stream();

        System.out.println("After filter the stream elements are : ");
        stringStream.filter(name -> name.length() == 3)
                .forEach(name -> System.out.println(name));
    }
}