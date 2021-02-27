/*
 * User 사용자 : Provider 제공자 
 * 
 * class A {}
 * class B {}
 * 
 * 관계) A는 B를 사용합니다 
 * 
 * 사용 방법
 * 1. 상속 A extends B
 * 2. 포함 A 라는 클래스를 B를 member field로 가질 수 있다  class A {B b;}
 * 2-1. 부분 집합 
 * 2-2. 전체 집합 
 * 
 * -----------------------------------------------------------------
 * >>차와 엔진 관계 (전체집합 : composition)
 * class B {}
 * class A {}
 *      int i;
 *      B b; //A는 B를 사용합니다 (포함) 
 *      A() {
 *          b = new B();
 *      }
 * }
 * 
 * >> B 라는 클래스는 독자적인 생성(x) >> A라는 객체가 만들어져야 B도 생성됨
 * >> A a = new A() >> A 객체도 생성되고, B 객체도 생성
 * >> 같은 생명 (생명 주기 같아요) >> 전체 집합 
 * 
 * -----------------------------------------------------------------
 * >>학생과 학교 관계  (부분집합 : Aggregation) 
 * class B {}
 * class A {
 *      int i;
 *      B b; //A는 B를 사용합니다 (포함) 
 *      A() {
 *      
 *      }
 *      A(B b) {
 *      this.b =b;
 *      }
 * }
 * 
 * >>void main()
 *   A a = new A();
 *   B b = new B();
 *   A a2 = new A(b); //부분 집합 
 *   
 * >>A와 B는 같은 운명체가 아니다 
 *   
 * -----------------------------------------------------------------
 * >>의존 관계 (Dependency) 
 * class B {}
 * class A {
 *      int i;
 *      A() {
 *      }
 *      
 *      void m(B b) { //A는 B에 의존합니다 (함수) , B타입의 member field가 없다 
 *          b 객체를 가지고 작업 
 *      }
 * }
 * 
 * void main() 
 * B b = new B();
 * A a = new A();
 * 어떤 상황에는 B 객체 필요
 * a.m(b);
 * 
 * 
 */

class B {}

class A {
    void method(B b) { //A는 B를 사용한다.
        
    }
}


//현대적인 프로그래밍 기법은 : 인터페이스 활용 
interface Icallable {
    void m();
}

class D implements Icallable {

    @Override
    public void m() {
        System.out.println("D Icallable 인터페이스 m() 재정의");
        
    }
    
}


class F implements Icallable {

    @Override
    public void m() {
        System.out.println("F Icallable 인터페이스 m() 재정의");
        
    }
    
}

//interface POINT >> 얼마나 유연하게 코딩하느냐,, 
class User {
    void method(Icallable ic) { //인터페이스의 주소값을 받는다 
        System.out.println("method 호출 !");
    }
    
    /* 현대적인 프로그래밍은 이렇게 안 합니다..
    void method(D d) {
        d.m();
    }
    void method(F f) {
        f.m();
    }
    */
}


public class Ex05_User_Provider {

    public static void main(String[] args) {
        B b = new B();
        A a = new A();
        a.method(b); //B타입의 객체 주소 
        
        D d = new D();
        F f = new F();
        User user = new User();
        user.method(d);
        user.method(f);

    }

}
