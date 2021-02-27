/*
 * class 내부 : instance variable (member field) (default)
 * method 내부 : local variable (반드시 초기화해서 사용)
 * ex) main(String[] args) >> 메인함수 안에 모든 변수는 사용시 초기화 
 * static variable : 객체간의 공유자원 >> 객체 생성 이전에 메모리에 올라가는 자원
 * class area(0) 또는 method area
 * 
 * 
 * javac Ex05_variable_scope.java (컴파일)
 * java Ex05_variable_scope (실행)
 * 
 * Ex05_variable_scope 정보 >> method(class) area
 * 그 때 클래스 안에 static 자원이 있다면 그 자원을 메모리에 올린다.
 * 
 */

class Variable {
    int iv; //member field, instance variable
    
    void method() {
        int lv = 0; //local variable (반드시 초기화)
        
        //for(int i = 0 ... // i는 block variable //for안에서만 유효        
    }
    static int cv;
    //1. class variable (클래스 변수), static variable(객체간 공유자원)
    //**객체 생성 이전에 메모리에 올라가는 자원
    //**new를 하지않아도 클래스 로더가 클래스의 정보를 읽다가 static자원을 만나면 함께 메모리에 올린다.
    
    //2. 목적: 정보를 담는 것 (생성되는 모든 객체가 공유하는 자원)
    //heap 영역에 생성된 [객체]들의 공유 자원
    //3. 특징 : 접근방법 
    //3.1 : class 이름.static[변수명] >> Variable.cv >> 객체가 생성되기 전에도 접근 가능
    //3.2 : Variable v = new Variable(); >> v.cv
    //      Variable v2 = new Variable(); >> v.cv
    //      v.cv == v2.cv 가 같은 주소의 메모리이다.
    //4. 생성시점 : Hello.java > Hello.java > Hello.class
    //>>java.exe Hello 엔터 실행 
    //>>class loader system에 의해서
    //
}


public class Ex05_variable_scope {

    public static void main(String[] args) {
        //System.out.println(Variable.cv);
        
        Variable v = new Variable();
        Variable v2 = new Variable();
        System.out.println(v.cv);
        System.out.println(v2.cv);
        
        Variable.cv = 200;
        
        System.out.println(v.cv);
        System.out.println(v2.cv);
        
        

    }
}



