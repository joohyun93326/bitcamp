import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
 * Map 인터페이스 
 * Map (key, value) 쌍의 구조를 갖는 배열 
 * ex) (02, 서울) (031, 경기)
 * key : 중복x 
 * value : 중복o
 * 
 * generic 자원 (key, value 타입을 강제 가능)
 * 
 * Map 인터페이스 구현 
 * 구버전 : HashTable 동기화 
 * 신버전 : HashMap(동기화를 강제하지 않아요) : 성능 고려 
 * 
 */


public class Ex12_Map_Interface {

    public static void main(String[] args) {
        //HashMap<K, v>
        HashMap map = new HashMap();
        map.put("Tiger", "1004");
        map.put("scott", "1004");
        map.put("superman", "1004");
        
        //사용자 id, pwd 관리 
        System.out.println(map.containsKey("tiger")); //false 대소문자 구분함!
        
        //중복id 검사 
        System.out.println(map.containsKey("scott")); //ture 
        System.out.println(map.containsValue("1004")); //true
        System.out.println(map.containsValue("1007")); //false 
        
        //point 
        //key를 제공하면 value 값을 알 수 있다 
        System.out.println(map.get("superman")); //value return
        System.out.println(map.get("hong")); //null 
        
        map.put("Tiger", "1007"); //key 중복x value 값을 overwrite 
        System.out.println(map.get("Tiger")); //1007 
        System.out.println(map.size()); // 3
        
        Object value = map.remove("superman");
        System.out.println("value : " +value); //value : 1004
        
        System.out.println(map.toString()); //{scott=1004, Tiger=1007} 재정의 
        
        Set set = map.keySet(); // key집합 >> 규칙 >> 순서(X) >> 중복(X) Set 
        Iterator it = set.iterator(); //순차적인 
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        
        Collection clist = map.values();
        System.out.println(clist.toString());
        

    }

}
