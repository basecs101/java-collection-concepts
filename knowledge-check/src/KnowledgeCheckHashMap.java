import java.util.HashMap;
import java.util.Map;
class Test {
    String name;
    public Test(String name) {
        this.name = name;
    }
    @Override
    public int hashCode() {
        return 1;
    }
}

class KnowledgeCheckHashMap {
    public static void main(String[] args) {
        Map<Test, String> map = new HashMap<>();
        Test test1 = new Test("a");//test1=1000h
        Test test2 = new Test("b");//test2=2000h
        map.put(test1, "abc");
        map.put(test2, "bcd");
        Test test3 = new Test("a");//test3=3000h
        Test test4 = new Test("b");////test4=4000h

        System.out.println(map.get(test3) + " " + map.get(test4));

    }
}