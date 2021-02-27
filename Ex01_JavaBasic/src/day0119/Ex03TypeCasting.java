package day0119;

public class Ex03TypeCasting {
    public static void main(String[] args) {
        
        //암시적 형변환
        //더 작은 데이터타입의 값을 더 큰 데이터타입에 옳겨 닮거나
        //정수 값을 실수로 바꿀 때 발생      
        byte b = 3;
        int number = b;
        System.out.println("number의 현재값: "+number);
        
        double d = number;
        System.out.println("d의 현재값: "+d);
        
        //명시적 형변환
        //더 큰 데이터타입의 값을 더 작은 데이터타입에 옮겨 닮거나
        //실수 값을 정수로 바꿀 때 발생
        number = 10;
        b = (byte)number;
        System.out.println("b의 현재값: "+b);
        
        b = (byte)3.14;
        System.out.println("b의 현재값: "+b);
        
        //원래라면 오버플로우 언더플로우는 일반적인 방법으로는 발생시킬 수 없지만
        //형변환을 사용하면 발생시킬 수 있다.
        
        //오버플로우
        //byte(-128~127)에 141을 넣으면?
        b = (byte)141;
        System.out.println("b의 현재값: "+b);
        //141 = 128 + 13
        //byte기준으로 128은 오버플로우가 발생해서 -128이 된다.
        //141 = -128 + 13 이 된다.
        //결과는 -115이다.
        
        //언더플로우
        //byte에 -130을 넣으면?
        b = (byte)-130;
        System.out.println("b의 현재값: "+b);
        //-130 = -129 -1
        //     = 127 -1
        //     = 126
        
    }
}







