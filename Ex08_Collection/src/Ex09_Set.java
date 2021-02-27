import java.util.HashSet;
import java.util.Iterator;

/*
 * Set 인터페이스를 구현하는 클래스 
 * Set : 순서가 없고 중복을 허락하지 않는 데이터 집합
 * HashSet, TreeSet
 * 
 */

public class Ex09_Set {

    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<Integer>();
        hs.add(1);
        hs.add(100);
        boolean bo2 = hs.add(55);
        System.out.println(bo2); //true 
        
        bo2 = hs.add(1); // 중복 허락 안함
        System.out.println(bo2); //false 
        
        hs.add(2);
        System.out.println(hs.toString()); //[1, 2, 100, 55] 배열이 아니니까 순서 보장 안됨 
        
        HashSet<String> hs2 = new HashSet<String>();
        hs2.add("b");
        hs2.add("A");
        hs2.add("A");
        hs2.add("F");
        hs2.add("C");
        hs2.add("z");
        hs2.add("z");
        System.out.println(hs2.toString()); //[A, b, C, F, z] 중복 허용 안함 
        
        String[] obj = {"A","B","C","D","D","A"};
        HashSet<String> hs3 = new HashSet<String>();
        for(int i = 0; i < obj.length; i++) {
            hs3.add(obj[i]);
        }
        System.out.println(hs3.toString());
        
        //Quiz 
        //HashSet을 이용해서 1~45 난수 6개를 넣으세요
        HashSet<Integer> lotto = new HashSet<Integer>();
        
        while(lotto.size() < 6) {
            lotto.add((int) (Math.random() * 45) +1);  
        }
        System.out.println(lotto); //[32, 33, 25, 26, 12, 30]
        
        
        //iterator로 출력하세요 
        HashSet<String> set3 = new HashSet<String>();
        set3.add("AA");
        set3.add("DD");
        set3.add("ABC");
        set3.add("FFF");
        System.out.println(set3.toString());
        
        //출력 
        Iterator<String> st = set3.iterator();
        while(st.hasNext()) {
            System.out.println(st.next()); //set은 배열이 아님!! 순차적으로 출력은 가능!!! 순서(오름차순) 보장X 
        }
        
        
    }

}
