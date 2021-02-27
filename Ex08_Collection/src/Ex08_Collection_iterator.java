import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/*
 * Collection FramWork 
 * 나열된 자원에 대해 순차적으로 접근해서 값을 리턴하는 표준 >> 표준, 약속 은 곧 인터페이스 설계 !
 * 
 * Iterator 인터페이스
 * >> hasNext(), Next(), remove() 추상 함수 
 * >> ArrayList >> Iterator 구현 
 * 
 * public Iterator iterator() {
 *      return new A implements Iterator
 * }
 * 
 * Iterator 를 사용하면 size 메소드를 얻어와서 반복 처리하는 것보다 속도에서 불리하다.
 * 컬렉션 종류에 관계없이 일관성있게 프로그래밍 할 수 있다는 장점을 갖고 있다.
 * 소스 코드에 어떤 컬렉션을 사용할지 정해지지 않았지만 컬렉션 내에 보관한 모든 내용을 출력할 때 용이하다.
 * 
 * 
 * 
 */

public class Ex08_Collection_iterator {

    public static void main(String[] args) {
        
        //기존 방식 
        ArrayList list = new ArrayList();
        list.add(100);
        list.add(200);
        list.add(300);
        
        //출력 문제없음 
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("-------------------");
        
        //표준화된 출력 방식(나열된 자원에 대해서)
        Iterator it = list.iterator();
        //ArrayList가 Collectioin 인터페이스가 가지고 있는 추상 함수 구현 
        //public Iterator iterator(); >> 구현
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        
        //정수값만 담을 수 있는 ArrayList를 만들자 
        ArrayList<Integer> intlist = new ArrayList<Integer>();
        intlist.add(10);
        intlist.add(11);
        intlist.add(12);
        
        Iterator<Integer> it2 = intlist.iterator();
        while(it2.hasNext()) {
            System.out.println(it2.next());
        }
        
        

    }

}
