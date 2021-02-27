import kr.or.bit.Pclass;

/*
 * private, default, public, 상속 관계에서의 protected
 * 
 * protected : 박쥐 (양면성) > default, public
 * 
 * >>상속이 없는 클래스 안에서 protected 접근자는 default와 같다.
 * >>결국 상속 관계에서만 의미를 가진다.
 * 
 * 설계를 할 때
 * member field에 protected를 쓴다는 것은, 상속 관계에서 써줬으면 좋겠다는 뜻인데 이 것보다 
 * 함수에서 protected를 쓴다는 것은 재정의와 관계가 있고  
 * >>protected 함수 안의 내용을 바꿨으면 좋겠다는 뜻 !!!
 * 
 */
        
class Dclass {
    public int i;
    private int p;
    int s;  //default
    protected int k; //default (일반 클래스는 사용할 이유가 없다)
}

class Child2 extends Pclass {
    void method() {
        this.k = 100;
        System.out.println(this.k);
        
    }
}

public class Ex08_Inherit_Protected {

    public static void main(String[] args) {
        Child2 ch = new Child2();
        ch.method();

    }

}
