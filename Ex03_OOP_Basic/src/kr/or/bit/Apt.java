package kr.or.bit;
/*
클래스는 설계도이다. 클래스는 타입이다.
클래스 == 설계도 = 데이터 타입(큰 타입)

설계도 정의 : 아파트 설계도 (설계도를 구성하는 요소)
클래스는 구체화를 통해서 사용 (집을 짓는 행위)
프로그램에서는 memory에 올리는 것 == 구체화 == new 연산 >> 만든 것 (객체: 인스턴스)

(class) 설계도라고 이야기하려면 최소한 ... 구성되어 있어야 한다.
1. 속성 (변수)
2. 기능 (함수)
*/


public class Apt {
    //메인함수가 없는 클래스 : 독자적으로 실행이 불가 / 메인함수가 있는 클래스에서 사용
    
    //변수 + 함수 
    public int door; //instance variable == member field 초기화하지 않아도 된다. default값이 있어서.
    public int window = 10; //초기화도 가능하다. 일반적으로는 초기화하지 않는다.
    
    public Car car; //default값 >> null
    
    //변수의 초기화 : 변수가 처음 값을 갖는 행위 
    //초기화 반대 <> default
    //정수 int 타입이 갖는 default 값 : 0
    //실수 double, float default 값 : 0.0
    //boolean default 값 : false (부정적이다.)
    //코딩은 네거티브하게. if를 쓸 때도 아닌 것 먼저. 
    
    //설계자의 의도: 왜 door를 초기화하지 않았을까?
    //아파트마다 문의 개수가 다를 수 있다.
    //집을 짓는 니가 알아서 설정해라.
    
    
    
    
}
