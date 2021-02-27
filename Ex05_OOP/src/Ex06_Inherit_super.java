/*
 * 
 * super(현재 자식이 부모의 접근 주소값) : 상속 관계에서 부모에게 접근 :
 * 자식 입장에서 super 부모의 객체의 주소
 * 
 * 1. super >> 상속 관계에서 자식이 부모에게 접근
 * 2. super >> 상속 관계에서 자식이 부모의 생성자를 호출(명시적으로) 
 * 
 */
class Base {
    String basename;
    Base() {
        System.out.println("Base 기본 생성자 함수");
    }
    Base(String basename) {
        this.basename = basename;
        System.out.println("basename :" +this.basename);
    }
    
    void method() {
        System.out.println("나 부모 method야 ");
    }
}

class Derived extends Base {
    String dname;
    Derived() {
        System.out.println("Derived 기본 생성자 함수");
    }
    
    Derived(String dname) {
        super(dname); //부모 생성자를 호출 
        
        this.dname = dname;
        System.out.println("dname : " +this.dname);
    }

    @Override
    void method() {
        // TODO Auto-generated method stub
        //super.method();
        System.out.println("부모함수 재정의");
        
    }
    
    //위처럼 오버라이드로 재정의 했는데 부모의 함수를 다시 보고 싶을 때
    //오버라이드한 함수는 지우지 않고, 부모 함수를 보는 방법은 super
    
    void parent_method() {
        super.method(); 
    }
    
    
}


public class Ex06_Inherit_super {

    public static void main(String[] args) {
        Derived d = new Derived("홍길동");
        d.method(); //부모의 함수호출 
        d.parent_method(); //재정의 후에 다시 호출하려고 super 쓴 함수
    }
}
