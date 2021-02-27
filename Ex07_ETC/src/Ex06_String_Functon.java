
public class Ex06_String_Functon {

    public static void main(String[] args) {
        //일상적으로 다루는 데이터 : 문자열, 숫자, 날짜 >> 함수 (시스템 함수)
        String str = "hello";
        String concatstr = str.concat(" world!"); //concat : 결합 함수 
        System.out.println(concatstr);
        
        boolean bo = str.contains("ello");
        System.out.println(bo);  //ture : ello가 포함되어 있다 
        
        bo = str.contains("elo");
        System.out.println(bo);  //false : elo는 연속으로 포함되어 있지 않다 
        
        String str2 = "a b c d";
        System.out.println(str2.length()); //7 : 공백도 문자열이다 
        
        String filename = "hello java world";
        System.out.println(filename.indexOf("h")); // 인덱스값 0 
        System.out.println(filename.indexOf("j")); // 인덱스값 6
        System.out.println(filename.indexOf("java")); // 0 : 제일 첫 글자 인덱스값 
        System.out.println(filename.indexOf("개폭망")); // -1 : 없는 글자는 -1 
        
        if(filename.indexOf("wo") != -1) {
            System.out.println("wo 하나라도 가지고 있구나 !");
        }
        
        System.out.println(filename.lastIndexOf("a"));  // 9 뒤에서 처음만나는 a의 인덱스값 
        
        //length(), indexOf(), substring(), replace(), split()
        
        String result = "superman";
        System.out.println(result.substring(0)); //superman 
        System.out.println(result.substring(2)); //perman
        System.out.println(result.substring(1,2)); //u : 인덱스1부터 2-1까지 출력
        System.out.println(result.substring(0,0)); //(0,-1) 안 나와요
        
        //Quiz
        String filename2 = "h.jpeg"; //또는 파일명이 hong.png 또는 h.tmp 일 수 있다. 
        //여기서 파일명과 확장자를 분리해서 화면에 출력하세요 
        //1.파일명 h 
        //2.확장자 jpeg 
        
        
        int temp = filename2.indexOf(".");
        System.out.println("파일 명 : " +filename2.substring(0,temp)); //파일명 
        System.out.println("확장자 : " +filename2.substring(temp+1)); //확장자 
        
        //replace (치환 함수) 
        String str3 = "ABCDADDDA";
        String result3 = str3.replace("DDDD", "오늘은 워료일");
        System.out.println(result3);
        
        //ETC
        System.out.println(str3.charAt(0));
        System.out.println(str3.charAt(3));
        
        System.out.println(str3.endsWith("DDDA")); //true
        System.out.println(str3.endsWith("BDDDA")); //false
        
        System.out.println(str3.equalsIgnoreCase("abcDADDDA")); //대소문자 구별 없이 ! 
        
        /*
        //Today Point (Split)
        String str4 = "슈퍼맨,팬티,노랑색,우하하,우하하";
        str4.split(",");
        String[] namearray = str4.split(",");
        for(String s : namearray) {
            System.out.println(s);
        }
        */
        
        //TIP) Java 특수문자
        //이스케이프 문자 >> 특정 문자 앞에 \
        char sing = '\''; 
        
        // 야 나는 ' 하나를 표현하고 싶어 .... 역슬러시라는 문자와 결합해서 사용하면 ... 문자 인정 
        System.out.println(sing);
        
        //홍"길"동 이라는 문자를 String 변수에 저장하고 화면에 출력
        String ename = "홍\"길\"동";
        System.out.println(ename);
        
        
        String str4 = "슈퍼맨.팬티.노랑색.우하하.우하하";
        str4.split(",");
        String[] namearray = str4.split("\\.");
        for(String s : namearray) {
            System.out.println(s);
        }
        
        //split 에서 split("."); 이 안되는 이유
        //String[] java.lang.String.split(String regex)
        //정규표현식을 따른다.
        //split("\\.");으로 써야한다 !
        
        //정규표현식 : 어떠한 문자를 만들 때 규칙(유효성 판단 근거)를 만들자 !
        //주민번호 : 숫자6자리-숫자7자리 : {\d6}-{\d7}
        //>>123-1234567 >> false
        //핸드폰, 차량번호, 우편번호, 한글 처리, 도메인 주소, 이메일 주소 
        
        //넌센스 
        String str6 = "홍      길      동";
        //"홍길동"
        //저장 >> 공백제거 >> "홍길동"
        System.out.println(str6.replace(" ", ""));
        
        String str7 = "          홍길동         ";
        System.out.println(">" + str7 + "<");
        System.out.println(">" + str7.trim() + "<");
        
        String str8 = "       홍      길      동       ";
        String result5 = str8.trim();
        String result6 = result5.replace(" ", "");
        System.out.println(result6);
        
        //자바에서 여러 개의 함수를 적용 (method chain 기법) 
        System.out.println(str8.trim().replace(" ", "").substring(2));
        
        
        //quiz-1
        //배열에 있는 문자값들의 합을 sum 변수에 담아서 출력 >> 결과 : 15
        int sum = 0;
        String[] numarr = {"1", "2", "3", "4", "5"};
        for(String s : numarr) {
            sum += Integer.parseInt(s); //문자를 숫자로 
            //Double.parseDouble(result6); //문자를 실수로 
        }
        System.out.println("sum : " +sum);
        

        //quiz-2
        //주민번호의 합을 구하세요 
        String jumin = "123456-1234567";
        //위 주민번호의 합을 구하세요_1
        int sum2=0;
        for(int i = 0 ; i < jumin.length() ; i++) {
            String numstr =jumin.substring(i, i+1);
            if(numstr.equals("-")) continue;
            sum2+= Integer.parseInt(numstr);
        } 
        System.out.println("주민번호 합:" + sum2);
        
        //위 주민번호의 합을 구하세요_2
        //String jumin="123456-1234567";
        String[] numarr2 = jumin.replace("-","").split("");
        int sum3=0;
        for(String i : numarr2) {
            sum3+= Integer.parseInt(i);
        }
        System.out.println("주민번호 합2:" + sum3);
        
        //위 주민번호의 합을 구하세요_3
        String jumin4 = jumin.replace("-", "");
        int sum4=0;
        for(int i = 0 ; i < jumin4.length() ;i++) {
            sum4+=Integer.parseInt(String.valueOf(jumin4.charAt(i)));
        }
        System.out.println("주민번호 합4:" + sum4);

    }

}
