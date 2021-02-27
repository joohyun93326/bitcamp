/*
 * 1.static member field (객체간 공유자원)
 * 
 * 2.static method 
 * >>math.random() >> Math m = new Math(); 왜 이렇게 하지 않았을까??
 * >>많이 사용될 것 같으니 편하게 사용하게 하기 위해 객체 생성 없이도 사용하게 해줌. >> static 
 * 
 */

class StaticClass {
    int iv;
    
    static int cv;
    
    void m() {
        //일반 함수에서 static 자원을 가지고 놀 수 있다!
        //static 자원은 일반 자원보다 항상 메모리에 먼저 올라감.        
        cv = 1000; // == StaticClass.cv = 1000; 이랑 같다. 
        //m이란 함수가 만들어지기 전에 cv는 메모리에 먼저 상주해있어서 쓸 수 있다.
        }
    
        static void sm() {
            //static 함수에서 일반 자원인 iv를 가지고 놀 수 없다 !
            //static이 먼저 만들어지기 때문에 일반 자원이 늦게 들어왔으니 쓸 수 없다.
            //iv = 1000; 에러 (iv변수를 static으로 변경하면 에러 안남)
            //에러가 없으려면 static은 static끼리 놀아라. 
            cv = 2222;
    }
}


public class Ex09_Static_Method {
    public static void main(String[] args) {
        
        System.out.println(StaticClass.cv);
        StaticClass.sm(); //sm() 호출
        System.out.println(StaticClass.cv);
        
        //일반자원 (객체 생성)
        StaticClass sc = new StaticClass();
        sc.m();
        sc.sm();
    }

}
