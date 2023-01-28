import java.util.HashMap;
import java.util.Map;
class TestMap {
    String name;
    public TestMap(String name) {
        this.name = name;
    }
    @Override
    public int hashCode() {
        return 1;
    }
}

class KnowledgeCheckHashMap {
    public static void main(String[] args) {
        Map<TestMap, String> hashMap = new HashMap<>();
        TestMap test1 = new TestMap("a");//test1=1000h
        TestMap test2 = new TestMap("b");//test2=2000h
        hashMap.put(test1, "abc");
        hashMap.put(test2, "bcd");
        TestMap test3 = new TestMap("a");//test3=3000h
        TestMap test4 = new TestMap("b");////test4=4000h

        System.out.println(hashMap.get(test3) + " " + hashMap.get(test4));

    }
}
/*
-:HashMap working mechanism:-
HashMap works in 2 passes:-

1 -> Use HashCode and then find index of bucket using hash function
2 -> Use equals method when two keys have same hashCode

There are 3 Scenarios->

1. Two keys have same hashCode 	    --> Use equals method
				    		        --> equals returns true --> overwrite/update
2. Two keys have same hashCode 	    --> Use equals method
				    		        --> equals returns false --> Create new node in same bucket.
3. Two keys have different hashCode --> Create new Node to store key,value

Visualize it as below:-
0[]
1[] -->[1000h, "a"] --> [2000h,"b"]-->null
2[]
3[]
4[]
5[]
6[]
7[]

1. In case of hashMap.get(test3) --> no key present in the map -->returns null
2. same for hashMap.get(test4) --> no key present in the map -->returns null
 */