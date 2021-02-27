/*
 * 추상클래스 : 인터페이스(interface)
 * 
 * 인터페이스 : 표준, 약속, 규약, 규칙 을 만드는 행위 
 * 
 * [추상클래스, 인터페이스 공통점]
 * 1. 스스로 객체 생성 불가능 (new를 통해 생성 안됨)
 *
 * [추상클래스, 인터페이스 차이점]
 * 1. 추상클래스(완성 + 미완성) , 인터페이스(모든 것이 미완성)>> 모든 것이 추상 자원 
 * 
 * [사용]
 * 1. 추상클래스 : extends 
 * 2. 인터페이스 : 반드시 구현해라 implements 
 * class Car extends abclass{ }
 * class Car implements la{ } >> 인터페이스가 가지는 추상 자원을 모두 재정의 해라 
 * 
 * 인터페이스는 [다중 상속]이 가능하다
 * 다중 상속(구현) >> 약속(작은 단위로 여러 개) >> 여러 개의 작은 약속이 모여서 큰 약속 
 * class Test extends Object implements Ia, Ib, Ic 
 * >>Ia, Ib, Ic (쪼개져 있는 인터페이스)
 * >>약속을 크게 만들면 사용성이 떨어진다 >> 쪼갠다.. 
 * 
 * 추상 클래스는 단일상속원칙(계층적 상속)
 * 추상 클래스는 완성된 코드 + 미완성 코드 
 * 인터페이스는 상수를 제외한 나머지는 미완성(추상)자원
 * 
 * 소프트웨어 설계의 최상위 단계 >> 그래서 어렵다. 경험이 필요하다.
 * 
 * 개발자(초급)
 * 1. 인터페이스를 다형성 입장으로 접근하자 (인터페이스는 부모 타입)
 * 2. 서로 연관성이 없는 클래스를 하나로 묶어주는 기능 
 * 3. Java API 에 이미 수많은 Interface들을 만들어 놓았다
 * 4. 인터페이스 (관용적) : ~able : ~할 수 있는 ex) Cloneable (복제할 수 있는)
 * 5. 객체 간 연결 고리(객체 간 소통) >> 다형성 >> 같은 부모 
 * 
 */

/*
interface Iable {
    String print();
}
class Test implements Iable {
    @Override
    public String print() {
        return null;
    }
}
*/

/*
1. 실제 구현부를 가지고 있지 않다 >> 실행 블럭이 없는 함수 : void run();
게임 설계 이동  move(int x, int y) >> 인터페이스 >> 탱크, 마린 >> move 구현
JAVA API : Collection(동적배열:자료구조) >> Vector, [ArrayList], HashSet, [HashMap]

2. 생성 방법 (interface 자원)
- public static final int VERSION = 1; >> int VERSION = 1; >>  컴파일러가 [public static final] 있다 

- public abstract void run(); >> [public abstract] 생략 >> void run();

//컴파일러가 바라보는 코드 
interface Iable {
    public static final int VERSION = 1;
    public abstract void run();
}

//실제 우리가 쓰는 코드 
interface Iable {
    int VERSION = 1;
    void run();
    String move(int x, int y);
}

interface able {int NUM = 0}
interface able {void rum(); void move();}

class Test implements Iable, Bable, Cable 
*/

interface Humanable {
    //int AGE; //public static final이 숨어있어서 에러남. final은 초기화를 해야 함 !!!
    int AGE = 100;
    String GENDER = "남";
    
    String print();
    void message(String str);    
}

interface Iable {
    int AGE = 10;
    void info();
    String val(String s);
}


class Test extends Object implements Humanable, Iable {

    @Override
    public void info() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public String val(String s) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String print() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void message(String str) {
        // TODO Auto-generated method stub
        
    }
}

public class Ex03_Interface {

    public static void main(String[] args) {
        Test t = new Test();
        
        Humanable h = t; //다형성 : 부모 h는 자식 t의 주소를 가질 수 있다 
        System.out.println(h.AGE); //100 
        
        Iable ia = t;
        System.out.println(ia.AGE); //10
    }
}
