import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex11_Set_Tree {

    public static void main(String[] args) {
        //Set 인터페이스 : 순서X, 중복X
        HashSet<String> hs = new HashSet<String>();
        
        hs.add("A");
        hs.add("b");
        hs.add("C");
        hs.add("D");
        hs.add("E");
        hs.add("F");
        hs.add("g");
        hs.add("H");
        hs.add("a");
        System.out.println(hs.toString());
        
        //TreeSet : 순서X, 중복X, 정렬O
        //검색과 정렬에 유리하다.
        
        //1. 이진트리구조
        //2. 데이터 저장될 때 정렬된다 ***
        Set<Integer> lotto = new TreeSet<Integer>();
        for(int i = 0; lotto.size() < 6; i++) {
            lotto.add((int)(Math.random()+ 45 + 1));
        }
        System.out.println(lotto.toString());
        
    }

}
