package kr.or.bit;
/*
 * 클래스 구성요소 (필드+함수)
 * 
 * 기능(행위) 만드는 방법
 * 함수(function, method)
 * method : 행위 또는 기능을 정의(최소 단위) : 하나의 함수는 하나의 기능만 구현
 * ex) 먹는다, 잔다, 걷는다
 * 함수는 호출에 의해서만 동작한다 !!!
 * 
 * JAVA)
 * 1. void(o), parameter(o) >> void print(String str) {실행코드} 돌려주지 않는데 받을거야.
 * 2. void(o), parameter(x) >> void print() {실행코드} 돌려주지 않고 받지도 않을거야.
 * 3. return type(o), parameter(o) >> int print(int data) {return data + 10;} 
 *    >>받고 정수값에 10을 더해서 돌려주겠다.  
 * 4. return type(o), parameter(x) >> int print() {return 100;} 
 *    >>받진 않고 100을 돌려줄거야.
 *    
 * void : 돌려주는 것이 없다 >> return value 가 없다.
 * return type >> 8가지 기본 타입, Array(배열의 주소값을 리턴), class, Collection, Interface
 * parameter type >> 8가지 기본 타입, Array(배열의 주소값을 리턴), class, Collection, Interface
 * 
 * parameter 개수는 제한이 없다.
 * void print(int a, int b, int c, ind d) {}
 * >>비정상 print(10, 20, 30) --> 정상 print(10, 20, 30, 40) >>parameter 개수 맞춰야함    
 * 
 * ex)
 * boolean print(boolean b) {return b};
 * print(false);
 * 
 * 함수 : 관용적 표현
 * 함수의 이름
 * void a() {}
 * 
 * stack에 메인함수가 없어지면 프로그램 종료
 * 
 * 
 */



public class Fclass {
    
   //void(O) parameter(O)
   public void m2(int i) {
        System.out.println("일반함수 : void, parameter(o)");
        System.out.println("parameter values: " + i);
    }
   //void(O) parameter(X)
   public void m() {
       System.out.println("일반함수 : void, prameter(x)");
   }
   
   //return(O) parameter(O)
   public int m4(int data) {
       return 100+data; //return type이 있으면 그 값을 받아야 한다.
   }
   //return(O) parameter(X)
   public int m3() {
       return 100; //return type 존재하면 반드시 return 키워드를 사용해야 한다.
   }
   
   
   
   
   
   //확장
   public int sum(int i, int j, int k) {
       return i + j + k;
   }
   
   //함수 접근자 private
   //함수 앞에 private 을 붙인 설계자의 의도: 내부에서만 사용 >> 다른 함수를 도와주는 역할
   //내부에서(Fclass)만 사용되는 "공통 함수"   
   private int subSum(int i) { //캡슐화한 subSum 생성
       return i + 100;
   }
   
   public void callSubSum() { //캡슐화된 subSum을 호출
       int result = subSum(100); 
       System.out.println("call result: " + result); //호출한 결과
   }
   
   
   private int operationMethod(int data) {
       return data * 200;    
   }
   
   public boolean opSum(int data) {
       //연산은 다른 함수에게 위임 (operationMethod)
       //본인은 논리만 판단
       boolean bo;
       int result = operationMethod(data);
       if(result > 0) {
           bo = true; 
       }else {
           bo = false;
       }
       return bo;
   }
   
   //Quiz
   //a와 b 중에 둘중에 큰 값을 return 하는 함수를 만드세요
   //ex) max(300,100) return 값은 300
   //public int max(int a, int b) {}
   

   //출제자의 의도
   //return을 최소화하자.
   public int max(int a, int b) {
       return (a > b) ? a : b;
   }
   
   
   
   //함수의 return type or parameter >> Array, class
   public Tv tCall() { //Tv 타입을 갖는 주소값을 리턴  == Tv타입의 메모리 주소를 줘.
       //return null; //난 Tv타입의 객체가 없어 (O)
       
       Tv t = new Tv(); //t라는 변수는 Tv타입 객체의 주소가 들어가있다.
       t.brandname = "LG";
       return t;
       //아래 코드가 더 편한데 개발자가 어떤 생각을 가지고? tv세팅 먼저하려고. 브랜드,제조사 등
       
       //return new Tv(); //Tv라는 객체의 주소값을 바로 리턴
       //어떠한 초기화도 없이 주소만 던지는 경우   
   }
   public void tCall2(Tv t) { //Tv라는 타입을 갖는 주소값을 parameter로 
       System.out.println("t 주소 값:" +t);
       
   }
}
