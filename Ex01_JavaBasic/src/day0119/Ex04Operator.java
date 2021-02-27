package day0119;

public class Ex04Operator {
    public static void main(String[] args) {
        
        int number1 = 4;
        int number2 = 7;
        
        System.out.println("number1 + number2: ");
        System.out.println(number1 + number2);
        
        System.out.println("number1 - number2: ");
        System.out.println(number1 - number2);
        
        System.out.println("number1 * number2: ");
        System.out.println(number1 * number2);
        
        System.out.println("number1 / number2: ");
        System.out.println(number1 / number2);
        //정수형 데이터타입끼리의 나눗셈은 무조건 몫만 구한다.
        
        System.out.println("number1 % number2: ");
        System.out.println(number1 % number2);
        
        System.out.println("======================");
        
        
        double d = 7.0;
        
        System.out.println("number1 + d: ");
        System.out.println(number1 + d);
        //정수와 실수를 연산시키면 결과값은 실수값이 나온다.
        
        System.out.println("number1 - d: ");
        System.out.println(number1 - d);
        
        System.out.println("number1 * d: ");
        System.out.println(number1 * d);
        
        System.out.println("number1 / d: ");
        System.out.println(number1 / d);
        
        System.out.println("number1 % d: ");
        System.out.println(number1 % d);

        //string의 경우 더하기 연산이 가능하다.
        //string에 더하기 연산을 하면 앞의 내용과 뒤의 내용을 모두 sting으로 만들고
        //두 내용을 이어 붙여라 라는 뜻이다.
        
        //string + "DEF" 는?
        //string의 현재 해당 주소값에 저장된 "abc"라는 글자와 "DEF"를 연결해서
        //"abcDEF"가 된다.
        
        //"number의 현재값: " + number의 경우
        //number 변수 안에 저장된 값을 string, 즉 글자로 바꾸고
        //"number의 현재값 " 뒤에 이어붙이라는 이야기가 된다.
    }
}








