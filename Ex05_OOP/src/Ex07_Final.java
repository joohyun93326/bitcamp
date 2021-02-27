/*

상수 < - > 변수
즉 상수란 한 번 값이 초기화(최초값 할당) 되면 변경 불가
상수 자원 : 고유값(주민번호), 수학에 나오는 수 많은 것들(파이값 3.14....라든가), 버전번호, 시스템 관리번호 등
상수는 관용적으로 대문자로 작성

java 문법의 상수 : final int NUM = 10;
c# 문법의 상수 : const integer NUM = 10;

**final**
- final + 클래스 = 더 확장 할 수 없는 클래스. 상속금지
            ex) final Math{}
- final + 함수 = 상속관계에서 재정의 금지(마지막 함수니까)
            ex) public final void print(){}
- public static final void print() : 한 번 정해지면 바꿀 수 없는 객체 간 공유자원

            >> final이 붙으면 더 변형할 수 없다고 생각하자
 */

class Vcard{
   final String KIND = "heart";
   final int NUM = 10;
   void method() {
      System.out.println(Math.PI);
   }
}

class Vcard2{
   
   final String KIND;
   final int NUM;
   // 이렇게만 써두면 위 두 코드가 오류난다
   // 상수는 반드시 값을 받아야하는데 초기화가 안 됨
   // 아래처럼 생성자를 만들면 위 두 코드의 오류가 사라진다
   // 대신 생성자 안에 내용이 없을 때 생성자에 오류가 발생
   // 값 달라고!!!!! 재촉하는 거
   
   Vcard2(){
      this.KIND = "heart";
      this.NUM = 10;
   }
   
   Vcard2(String kind, int num){
      // 여기까지 쓰면 또 초기화가 안 될 거라는 여지가 생겨서
      // 오류 발생 아래에 다시 두 상수를 초기화해주면 오류가 사라진다
      
      this.KIND = kind;
      this.NUM = num;
   }
   // 이렇게 쓰고 값 확인하고 싶은데 귀찮으면 toString사용   

   @Override
   public String toString() {
      return "Vcard2 [KIND=" + KIND + ", NUM=" + NUM + "]";
   }
      

}

public class Ex07_Final {
   public static void main(String[] args) {
      
      Vcard vcard = new Vcard();
      System.out.println("vcard.KIND");
      vcard.method();
      
      Vcard2 vcard2 = new Vcard2();
      System.out.println(vcard2);
      
      // Vcard2 파라미터가 있는 함수 써보기 위해 생성자 사용
      Vcard2 vcard3 = new Vcard2("Space", 7);
      
   }

}