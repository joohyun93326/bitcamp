import java.util.Calendar;
import java.util.Date;

import kr.or.bit.utils.Edu_Date;


/*
* Calendar 를 상속받아 완전히 구현한 클래스는 
 * GregorianCalendar
   buddhisCalendar 있는데 getInstance()는 [시스템의 국가와 지역설정]을 [확인]해서
      태국인 경우 buddhisCalendar 의 인스턴스를 반환하고 그 외에는 GregorianCalendar
     의 인스턴스를 반환한다
   GregorianCalendar 는 Calendar를 상속받아 오늘날 전세계 공통으로 사용하고 있는 
   그레고리력에 맞게 구현한 것으로 태국을 제외한 나머지 국가에서는 GregorianCalendar 사용
   그래서 인스턴스를 직접 생성해서 사용하지 않고 메서드를 통해서 인스턴스를 반환받게하는
   이유는 최소의 변경으로 프로그램 동작을 하도록 하기 위함
   class MyApp{
     static void main(){
      Calendar cal = new GregorianCalendar();
      다른 종류의 역법의 사용하는 국가에서 실행하면 변경......    }  }
   class MyApp{
     static void main(){
      Calendar cal = new getInstance();
        다른 종류의 역법의 사용하는 국가에서 실행하면 변경......   }  }
  API : 생성자 Protected Calendar() 
 */
//Java API
//날짜 : Date (구) -> Calendar(신)
public class Ex09_Calendar {
    public static void main(String[] args) {
        //구버전 
        Date dt = new Date();
        System.out.println(dt.toString()); //Wed Feb 17 10:07:08 KST 2021
        
        //신버전   
        //Calendar cal = new Calendar(); //new 하는 거 아님 
        Calendar cal = Calendar.getInstance(); //내부적으로 new 날짜 객체 생성해서 주소 전달 
        System.out.println(cal.toString()); //재정의 (날짜 정보 다 출력)
        
        //당신이 필요한 형식을 추출해서 조합해라 
        System.out.println("년도 : " +cal.get(Calendar.YEAR)); 
        System.out.println("월(0~11) : " + (cal.get(Calendar.MONTH)+1)); //연산 후 +1 
        System.out.println("일 : " +cal.get(Calendar.DATE)); 
        
        //cal.get() 리턴 타입 >> 정수 >> 결과 >> 연산 
        
        System.out.println("이 달의 몇째 주 : " + cal.get(Calendar.WEEK_OF_MONTH));
        System.out.println("            : " + cal.get(Calendar.DAY_OF_MONTH));
        System.out.println("            : " + cal.get(Calendar.DAY_OF_WEEK));
        
        System.out.println("시간 : " +cal.get(Calendar.HOUR));
        System.out.println("분 : " +cal.get(Calendar.MINUTE));
        System.out.println("초 : " +cal.get(Calendar.SECOND));
        
        //학사 관리 시스템
        //회원가입페이지, 학사 신청 페이지 등을 페이지 본수라고 하는데
        //200 페이지가 있고 그 중에 150페이지에는 날짜 정보가 있다고 할 때
        //해당 페이지들은 상단에 현재 날짜가 출력됨 ex) 2021-02-17
        //요구사항 : 2021년02월17일
        //위쪽처럼 프로그램을 짰다면 150번 수정해야 함
        
        //그럼 별도의 클래스를 설계하자!
        //EduDate.today() 호출해서 today()함수 한번만 수정할 수 있게 !
        //Edu_Date.java
        String result = Edu_Date.DateString(cal); //2021년2월17일
        System.out.println(result);
        
        result = Edu_Date.DateString(cal,"-"); //2021-2-17
        System.out.println(result);
        
        result = Edu_Date.monthFormat_DateString(cal); //2021년02월17일 
        System.out.println(result);
        
    }

}








