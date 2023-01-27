import java.util.HashMap;
class Test{
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
        HashMap<Test, String> map = new HashMap<>();
        map.put(new Test("a"),"a");
        map.put(new Test("b"),"b");
        System.out.println(map.get(new Test("b")) + " "+ map.get(new Test("b")));
    }
}