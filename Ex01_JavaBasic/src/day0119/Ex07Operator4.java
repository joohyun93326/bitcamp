package day0119;

public class Ex07Operator4 {
    public static void main(String[] args) {
        //1. AND 연산자
        System.out.println("true && true :" + (true && true));
        System.out.println("true && false :" + (true && false));
        System.out.println("false && true :" + (false && true));
        System.out.println("false && true :" + (false && true));
        
        //2. OR 연산자
        System.out.println("true || true :" + (true || true));
        System.out.println("true || false :" + (true || false));
        System.out.println("false || true :" + (false || true));
        System.out.println("false || false :" + (false || false));
        
        //3. NOT 연산자
        boolean b = true;
        System.out.println("b의 현재값 :" + b);
        System.out.println("!b의 현재값 :" + !b);
        System.out.println("b의 현재값 :" + b);
    }

}
