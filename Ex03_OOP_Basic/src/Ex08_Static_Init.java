//static 변수     >> 모든 객체가 [같은 값]을 가지게 한다.
//instance 변수   >> 모든 객체가 [다른 값]을 가지게 한다.


class InitTest {
    static int cv = 10; 
    static int cv2;
    int iv = 11;
    
    //static 블럭 (static 초기자 설정 블럭)
    static {  
        cv = 10; //member field 초기화 
        cv2 = cv+222; //변형된 값을 제공 
    } 
    
    {   //instance variable 초기화 블럭
        //new를 통해서 객체가 생성되고 int iv 변수가 메모리에 올라가고 나서 바로 호출 >> { }
        System.out.println("초기자 블럭");
        if(iv > 10) iv = 100; //조건문 사용이 가능
    }    
}

public class Ex08_Static_Init {

    public static void main(String[] args) {
        System.out.println(InitTest.cv);
        System.out.println(InitTest.cv2);
        
        //일반자원
        InitTest inittest = new InitTest();
        System.out.println(inittest.iv);
    }

}





