/* 생성자 함수(Constructor)
 * 1. 함수 (특수한 목적)
 * 2. 특수한 목적 >> member field 초기화 
 * 
 * Tip) {초기자 함수}, static{초기자 함수}
 * 
 * 3. 일반 함수와 다른점 (public, void m(), public String m(String s) ....)
 * - 함수의 이름이 고정(class 이름과 동일)
 * - 실행시점 : 객체 생성(new) >> heap 공간이 할당되고 >> 변수(member field) >> 생성자 함수 자동 호출
 * - 실행시점 : return type이 없음 >> 생성자 함수는 무조건 void >> public [void] 클래스 이름 >> public 클래스 이름
 * 
 * 4. 목적 : 생성되는 객체마다 [강제적으로] member field 값을 초기화할 수 있다.
 * 
 * class Car {
 *      String color;
 * }
 * --자동차를 만들면 무조건 색상 하나를 가져야 한다.
 * Car car = new Car();
 * --자동차는 각각 다른 색상을 가질 수 있다.
 * class Car {
 *      public Car(String color) {     
 *      }
 * }
 * 
 * Car car = new Car("red");
 * 
 * 5. 생성자 함수 (method overloading)
 * 6. 만약 overloading 생성자 함수를 하나라도 구현했다면
 * --dafault 생성자 함수는 반드시 구현을 통해서만 사용 가능하다.
 * 
 */

class Car {
    String carname = "포니";
    //보이지 않지만 default로 생성자 함수가 생략되어 있다.
    //컴파일러가 알아서 생성한다. --> public Car()
    public Car() {
        System.out.println("나 생성자야!");        
    }    
}
class Car2 {
    String carname;
    public Car2() { //parameter가 없는 생성자 >> default constructor
        carname = "포니"; //초기화 
    }
}
class Car3 {
    String carname;
    public Car3() {
        carname = "포니";
    }
    public Car3(String name) {
        carname = name;
    }
}
class Car4 {
    String carname;
    //예외적으로 오버로딩 생성자를 구현했다면 default는 자동으로 생성되지 않아요.
    //default 구현하지 않은 설계자의 의도 : 강제적 구현을 하려고 
    public Car4(String name) {
        carname = name;
    }
}



public class Ex16_Constructor {

    public static void main(String[] args) {
        Car car = new Car(); //생성자를 호출하는 괄호
        
        Car3 car3 = new Car3(); //dafault constructor 자동 호출
        System.out.println(car3.carname);
        
        Car3 car4 = new Car3("지네시스"); //overloading constructor
        System.out.println(car4.carname);
        
        Car3 car5 = new Car3("포트"); //overloading constructor
        System.out.println(car4.carname);
        
        Car3 car6 = new Car3("벤트"); //overloading constructor
        System.out.println(car4.carname);

    }

}
