/*
 * 클래스 == 설계도 == 데이터 타입(사용자 정의)
 * 클래스 구성 요소 : [필드(속성) + 함수(기능)] + 생성자 함수
 * field >> 고유데이터, 상태데이터, 부품(참조)정보 >> 변수
 * function >> 기능 행위 >> 최소 단위(1개의 기능)
 * 추가적으로 생성자 함수 >> member field 초기화 목적 
 * 
 * 클래스, 필드, 생성자 함수 : 어느 곳에 위치하느냐 (scope)영역
 * 
 * >> 접근자, 한정자, 수정자
 * >> public, private, default, protected(상속)
 * 
 * 1. public class Car {} >> kr.or.bit.common 폴더 아래 있는 Car
 * 2. class AirPlane{} >> default 생략 >> 컴파일러가 자동 default 있는 것 처럼..
 * >> default (같은 패키지)
 * >> default 접근자는 [같은 패키지 접근 가능] [다른 패키지에 있으면 서로 접근 불가]
 * >> default 접근자는 같은 패키지 연습 목적
 * >> program 같은 폴더 안에 있는 클래스는 사용 가능
 * 3. 하나의 물리적인 자바 파일은 여러개의 클래스를 가질 수 있다. 
 * Ex01_main.java >> 여러 개의 클래스 가질 수 있음. 단, Ex01_main 클래스만 public 을 갖는다.
 * >> 나머지는 다 default
 * 
 */

class Test { //default class Test
    int data; // public, private 이런 게 없으면 무조건 default 접근 제한
}

class Test2 { //default class Test2
    int data2;
    public int data3; //문법적으로는 오류가 없지만 이미 default를 갖고있으니 쓰지 않아야 한다. 
    
    private int data4; //getter와 setter 를 만들거면 이해 가능
    void setData(int d) {
        data4 = d;
    }
    int getData4() {
        return data4;
    }
}
//위처럼 여러 개의 클래스를 가질 수 있지만 Ex01_main만 public을 갖는다.
//연습할 때만 사용 ! 


public class Ex01_main { //클래스 앞에 public이 붙어있으면 아무데서나 가져다 써라. 
    public static void main(String[] args) {
        //Car car = new Car();
        //car.door = 100; //Car class는 public이지만 int door는 default여서 그냥은 사용 못함
        //car.window = 10; //window는 public이어서 다른 패키지이지만 사용 가능함
        
        Test test = new Test();
        test.data = 100;
        System.out.println(test.data);
        
        
        Test2 test2 = new Test2();
        test2.data2 = 200;
        System.out.println(test2.data2);
        
        
        
        
    }

}


