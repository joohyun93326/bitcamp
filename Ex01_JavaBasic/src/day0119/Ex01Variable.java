package day0119;

public class Ex01Variable {
    public static void main(String[] args) {
        //int 변수 number 선언
        int number;
        
        number = 20;
        
        System.out.println("number의 현재값: "+number);
        
        number = 45;
        System.out.println("number의 현재값: "+number);
        
        //아스키코드 A = 65
        number = 'A';
        System.out.println("number의 현재값: "+number);
        //만약 우리가 지정한 변수의 데이터타입과 다른 값을 넣어주면 에러 발생
        
        
        //실수형 변수 만들기
        double d = 3.141592;
        System.out.println("d의 현재값: "+d);
        
        //정수형 공간에 실수값을 넣을 수는 없지만
        //실수형 공간에 정수값을 넣을 수는 있다.
       
        d = 3;
        
        //문자형 변수 만들기
        char c = 'b'-32; 
        //b의 아스키코드 : 98
        //98-32 = 66
        //66에 해당하는 알파벳 = 'B'
        System.out.println("c의 현재값: "+c);
        
    }
}
