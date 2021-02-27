import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex02_ArrayList {

    public static void main(String[] args) {
        //List 인터페이스 구현 : 순서,중복 허용하는 데이터 집합 다룰 때 쓰는 클래스
        
        ArrayList arraylist = new ArrayList();
        //Object 타입을 가지는 정적배열 heap 생성
        arraylist.add(100);
        arraylist.add(200);
        arraylist.add(300);
        
        for(int i = 0; i < arraylist.size(); i++) {
            System.out.println(arraylist.get(i));
        }
        System.out.println(arraylist.toString()); //[100,200,300]
        System.out.println(arraylist.get(0)); //100 
        
        //비순차적인 데이터 추가, 삭제 >> ArrayList 적합하지 않아요 >> 순서가 있는 데이터 집합에 적합함 
        
        
        arraylist.add(0, 111); //0번째 방에 111 넣으면? 
        System.out.println(arraylist); // [111, 100, 200, 300]
        
        arraylist.add(400); //인덱스 없이 400을 넣으면? 
        System.out.println(arraylist); // [111, 100, 200, 300, 400]
        
        
        //[111, 100, 200, 300, 400] arraylist 
        //ArrayList 함수 공부
        
        //contatins() : 해당 값이 있는지 확인 
        System.out.println(arraylist.contains(200)); //true
        System.out.println(arraylist.contains(2000)); //false 
        
        //clear : 데이터 삭제 , 공간은 유지 
        arraylist.clear();
        System.out.println(arraylist.size()); //데이터 없으니까 0 
        System.out.println(arraylist.isEmpty()); //비어있니? true
        
        arraylist.add(101);
        arraylist.add(102);
        arraylist.add(103);
        
        System.out.println(arraylist.size()); //데이터 넣었으니까 3 
        System.out.println(arraylist.isEmpty()); //비어있니? false 
        
        Object value = arraylist.remove(0); //0번째 방의 값인 101을 삭제, 그 값을 return 
        
        System.out.println("value : " +value); //101
        System.out.println("삭제 후  : " +arraylist.size()); //2
        System.out.println(arraylist.toString()); //[102, 103] 
        
        //POINT 
        //개발자는 다형성을 좋아한다. (확장성, 유연성)
        
        //List 는 ArrayList의 부모 타입이다. 
        //List 인터페이스를 상속받아서 Vector랑 ArrayList를 만들어 둔 것.
        List li = new ArrayList();
        
        li.add("가"); //add는 결국 List 꺼 였다.
        li.add("나");
        li.add("다");
        li.add("라");
        List li2 = li.subList(0,2); //subList를 통해서 데이터 집합 생성 
        System.out.println(li2.toString()); //[가, 나] 
        
        ArrayList alist = new ArrayList();
        alist.add(50);
        alist.add(1);
        alist.add(7);
        alist.add(40);
        alist.add(46);
        alist.add(3);
        alist.add(15);
        System.out.println(alist.toString()); //[50, 1, 7, 40, 46, 3, 15] 
        Collections.sort(alist); //정렬 !!!! 오름차순 
        System.out.println(alist.toString()); //[1, 3, 7, 15, 40, 46, 50]
        
        Collections.reverse(alist); //정렬 !!!! 내림차순 
        System.out.println(alist.toString()); //[1, 3, 7, 15, 40, 46, 50]
        

    }

}
