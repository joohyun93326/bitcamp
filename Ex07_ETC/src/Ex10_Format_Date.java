import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//https://cafe.naver.com/springbit/315


public class Ex10_Format_Date {
    public static void main(String[] args) {
        Date curdate = new Date();
        Calendar cal = Calendar.getInstance();
        System.out.println("date : " + curdate); //날짜 형식  >> format 
        System.out.println("cal : " + cal); //문자열 결합
        System.out.println("cal getTime()  함수 : " + cal.getTime()); // getTime >> format
        
        
        
        SimpleDateFormat dateformat = new SimpleDateFormat("yyyyMMddHHmm");
        System.out.println(dateformat.format(curdate)); //format함수는 인자로 Date형식만 받는다.
        System.out.println(dateformat.format(cal.getTime()));
        
        //사이트 정보 입력
        //문자열 >> 날짜 형식으로 변환 
        String StringDate = "202008261212";
        try {
                        Date stringdate =  dateformat.parse(StringDate);
                        System.out.println("stringdate : " + stringdate);
                        
                        long datelong =  stringdate.getTime();
                        System.out.println(datelong);
        } catch (ParseException e) {
                    e.printStackTrace();
        }
        
        
        double money = 123456.5678;
        DecimalFormat df = new DecimalFormat("0.0");
        System.out.println(df.format(money)); //123456.6 반올림 (결과는 문자데이터)

         DecimalFormat df2 = new DecimalFormat("0");
        System.out.println(df2.format(money)); //123457 반올림 (결과는 문자데이터) 

    
        //반올림 처리 확인
        DecimalFormat df3 = new DecimalFormat("0.000"); //123456.568 
        System.out.println(df3.format(money));

        DecimalFormat df4 = new DecimalFormat("-#.#"); //-123456.6 

         DecimalFormat df5 = new DecimalFormat("#%"); //12345657%
        System.out.println(df5.format(money));

        Date today = new Date();
        SimpleDateFormat s = new SimpleDateFormat("yyyy-----MM/dd"); //2021-----02/17
        System.out.println(s.format(today));

        
        SimpleDateFormat s2 = new SimpleDateFormat("yyyy년 MMM dd일 E요일");
        System.out.println(s2.format(today)); //2021년 2월 17일 수요일


        SimpleDateFormat s3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:sss");
        System.out.println(s3.format(today)); //2021-02-17 11:57:27:027

        //혼용
        Calendar c = Calendar.getInstance();
        Date d = c.getTime(); //Calendar 형식을 Date 형식
        System.out.println(s3.format(d)); //2021-02-17 11:57:27:027
        
    }

}






