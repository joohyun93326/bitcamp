import kr.or.bit.Fclass;
import kr.or.bit.Tv;

public class Ex02_MethodCall {

    public static void main(String[] args) {
        Fclass fclass = new Fclass();
        fclass.m(); // .누르면 heap에 올라감
        fclass.m2(100);
        
        int result = fclass.m3(); //리턴값이 있으니 받아줄 result를 선언해준다.
        System.out.println(result);
        
        result = fclass.m4(200);
        System.out.println(result);
        
        result = fclass.sum(10, 20, 30);
        System.out.println(result);
        
        fclass.callSubSum();
        
        boolean bo = fclass.opSum(20);
        System.out.println(bo);
        
        
        //Quiz
        result = fclass.max(300, 100);
        System.out.println(result);

        
        Tv tv = fclass.tCall(); //Tv 타입을 가지는 주소값을 받을 수 있다.
        System.out.println("tv : " +tv);
        
        Tv tv2 = new Tv(); //tv2의 주소
        fclass.tCall2(tv2); 
        System.out.print("tv 2 : " +tv2);
        
        
        

        
    }

}












