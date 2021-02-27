package kr.or.bit;
//싱글톤 패턴
//디자인 패턴(생성 패턴) >> new (객체)
//객체 하나를 만들어서 공유하겠다. (static하고는 다른 개념)
//의도 : 하나의 객체를 만들어 공유하겠다. 

//싱글톤 패턴의 공통적인 특징은 private constructor 를 가진다는 것과, static method 를 사용한다는 점입니다.

//생성자를 막겠다 >> private 붙인다 >> 그럼 new가 안되네? >> 다른 방법(static)을 써서 객체를 공유하자

//활용 : 공유 프린터, 공유 와이파이 


public class Singleton {
    private static Singleton p;
    private Singleton() { //private
        //직접 객체 생성 불가 (new 못함. heap에 객체 생성 불가)
        
    }
    public static Singleton getInstance() { //밖에서 노출될 수 있는 자원 : public
        if(p == null) {
            p = new Singleton(); //생성자 호출 객체 만들고 p에 주소값 할당 
        }
        return p;
    }

}
