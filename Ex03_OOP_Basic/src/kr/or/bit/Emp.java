package kr.or.bit;

//class == 설계도 == Type(사용자 정의 타입)

//사원이라는 설계도
//사원을 표현 (사번, 이름, 직종 ...)
public class Emp {
    
    //정보를 담을 수 있는 변수
    //사원은 사번을 가지고 있다 (사번 숫자)
    //변수 > 정보 (고유, 상태, 부품)를 담을 수 있는 공간의 이름 >> instance variable(객체 변수) >> member field
    //변수의 종류(scope : 유효범위): 선언되는 위치에 따라 종류가 나뉨
    //1.local variable (지역 변수 : 함수 안에서만 존재함) class Person{ public void run() {int speed;}}
    //1.1 함수 안에 if블럭, for블럭 안에 변수 (block) : 지역 변수보다 작은 범위 
    //2.instance variable class Person { public int age; }
    //3.static variable : 객체 간의 공유 자원
    
    
    
    //클래스의 종류
    //1.class Test{ } >> 독자적인 실행 불가능 >> 다른 클래스를 도와주는 클래스(타입) >> lib
    //2.class Test{public static void main(String[] args) {}} >> 독자적인 실행 가능
    //2.1 >> 함수의 이름(main) >> 약속 >> 시작점(진입점)
    //Tip) c# >> Main()
    
        
    //private : 캡슐화 (자원을 보호하겠다)
    //직접할당을 막고 간접할당을 통해서 자원을보호한다.
    //멤버필드 앞에 접근자 : private
    //읽거나 쓰려면 함수 사용 : getter , setter
    private int empno;
    private String ename;
    private String job;
    
   
    //getter 와 setter 함수 생성
    public String getEname() { //getter함수
        return ename +"님";
    }
    public void setEname(String ename) { //setter함수  
        this.ename = ename;
    }
    
    
    private int num;
    //함수 (최소의 기능(행위) 단위)
    //간접 (누군가를 통해서 전달, 누군가를 통해서 받겠다) 
    public void setNum(int n) { //setter 기능함수(write함수)
       if(n > 0) {
           num = n;
       }else {
           num = 0;
       }
           
    }
    public int getNum() { //getter 기능함수(read 함수)
        return num;
    }
    
    public int number;
    
}
