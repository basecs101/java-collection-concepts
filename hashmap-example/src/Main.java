import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        Map<String, Integer> cityPopulation = new HashMap<>();

        cityPopulation.put("Pune",1000000);
        cityPopulation.put("Mumbai",1800000);
        cityPopulation.put("NYC",1200000);
        cityPopulation.put("London",400000);

        for (Map.Entry<String, Integer> entry : cityPopulation.entrySet()){
            System.out.println("City Name : " + entry.getKey() + " Population : "+entry.getValue());
        }
    }
}