import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> guestList = new LinkedList<>();

        guestList.add("Vikram");
        guestList.add("Vishal");
        guestList.add("Vinay");

        //head(contains the addr of first node) --> ["Vikram" | addr of second node] --> ["Vishal" | addr of third node] --> ["Vinay" | addr null] --> null

        guestList.forEach(name -> System.out.println(name));

        System.out.println("second element : "+guestList.get(1));

        System.out.println("Removing 3rd element : "+guestList.remove(2));

        List<String> newGuests = new LinkedList<>();
        newGuests.add("Aditi");
        newGuests.add("Nikita");
        newGuests.add("Anjali");
        guestList.addAll(newGuests);
        guestList.forEach(name -> System.out.println(name));

    }
}