package kr.or.bit.utils;
import java.util.Calendar;

/* 
 * 날짜의 형식을 제공하는 설계도 
 * 많이 사용 하는 기능을 편하게 쓰기 위해서는? new를 안함 >> Static 함수 사용 
 * 
 */



public class Edu_Date {
    public static String DateString(Calendar date) {
        return  date.get(Calendar.YEAR) + "년" +
                (date.get(Calendar.MONTH)+1) +"월" +
                date.get(Calendar.DATE) + "일";
        
    }
    public static String DateString(Calendar date ,String opr) {
        return  date.get(Calendar.YEAR) + opr +
                (date.get(Calendar.MONTH)+1) +opr +
                date.get(Calendar.DATE);
        
    }
    
    //2021년2월17일
    //2021-2-17
    //요구사항 
    //2021-2-17
    //1~9월 은 01,02월 
    //10, 11, 12월은 그대로 
    public static String monthFormat_DateString(Calendar date) {
        String month="";
        if((date.get(Calendar.MONTH) +1) < 10) {
            month = "0"+ (date.get(Calendar.MONTH) +1);
        }else {
            month = String.valueOf((date.get(Calendar.MONTH) +1)); //String.valueOf(정수) >> 문자열 
        }
        
        //String.valueOf()  숫자를 -> 문자로
        //Integer.parseInt(s)  문자를  -> 정수로
        return date.get(Calendar.YEAR) + "년" 
                + month + "월" 
                + date.get(Calendar.DATE) +"일" ;
    }
    
}
    






