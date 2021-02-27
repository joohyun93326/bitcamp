import java.util.Vector;

/*
 * Collection FrameWork
 * 
 * [다수의 데이터]를 다루는 [표준화된 인터페이스]를 [구현하고 있는 클래스 집합]
 * 
 * 
 * Collection 인터페이스 -> List 인터페이스 상속 -> ArrayList (구현 : 수많은 약속)
 *                    -> Set 인터페이스 상속 -> HashSet, TreeSet (구현)
 * 
 * Map 인터페이스 (key, value)  -> HashMap(구현)
 * 
 * List - 순서 보장, 중복 허용 (줄을 서시오 : 번호표) >> 내부적으로 데이터(자료, 객체) >> *배열관리* 
 * 예) [홍길동][홍길동][홍길동]
 * 
 * 구현하고 있는 클래스
 * 1.1 Vector(구버전) -> 동기화 보장(멀티 스레드) -> Lock(장치) -> 성능 조금 -> 안전성 좋음
 * 1.2 ArrayList(신버전) -> 동기화 보장(멀티 스레드) -> Lock(장치XX) -> 필요에 따라서 -> 성능 우선 -> 안전성 떨어짐
 * 
 * 멀티 스레드 : 하나의 프로그램에서 여러 개의 메소드가 동시에 동작 
 * 
 * 기존의 여러 개의 같은 타입의 데이터 관리 : Array 정적(고정)
 * 방의 개수가 한번 정해지면 방의 크기 변경 불가 
 * 
 * Array 
 * 1. 배열의 크기 고정 : Car cars = {new Car(), new Car()}; // 방 2개
 * 2. 접근 방법 : index >> cars[0] ,,, n방까지 >> length-1 
 * 3. 초기 설정 불가 
 * 
 * <-> Collection 
 * List > Vector, ArrayList 
 * 1. 배열의 크기를 동적으로 확장, 축소 가능 >> ***사실은 [배열의 재할당] 이용***
 * 2. 순서를 유지(내부적으로 index 배열), 중복값 허용 
 * 3. 데이터 저장 공간 : Array 
 * 
 */

public class Ex01_Vector {

    public static void main(String[] args) {
        Vector v = new Vector();
        System.out.println("초기 default 용량 : " +v.capacity()); //10개 배열 
        System.out.println("size : " +v.size());
        
        v.add("AA");
        v.add("AA");
        v.add("AA");
        System.out.println("데이터의 크기는 size : " +v.size()); //size : 3 
        System.out.println(v.toString()); //[AA, AA, AA] 주소값을 출력하지만 vector가 재정의 함 
        //Array : length
        //Collection : size
        //사이즈만큼 돌면서 get함수로 끄집어 낸다 !! 
        for(int i = 0; i < v.size(); i++) {
            System.out.println(v.get(i)); //array[i] // 함수 get(index)
        }
        

    }

}
