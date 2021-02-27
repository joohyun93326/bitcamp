/*
 * 추상 클래스 
 * >>미완성 클래스 (완성되지 않은 설계도)
 * 1. 완성된 코드 + 미완성 코드 
 * - 완성된 코드(실행 블럭이 있는 독립적으로 실행 가능한 함수 : void run() {}; ) 
 * - 미완성 코드 (실행 블럭이 없는 함수 : void run(); ) 
 * 2. 완성된 클래스(new 가능) : 미완성 클래스(스스로 객체 생성 불가능) 
 * 
 * 정리
 * 1. 추상 클래스(미완성) : 스스로 객체 생성 불가 (new 사용 불가) >> 결국 완성된 클래스로 만드는 것이 목적 
 * >> 상속을 통해서 완성된 클래스로 만들어보자 !!!!
 * 2. 상속 관계에서 미완성 자원(추상 함수)을 완성해라 >> 추상 자원을 재정의(Override) 해라 
 * 
 * 설계자의 의도 : 상속에서 반드시 재정의 해라 >> 강제적 구현(믿지 못하니까) 
 * 
 */

//추상클래스//
abstract class AbClass { //abstrat 클래스 안에 최소 1개의 추상 자원을 만들겠다 
    //완성된 코드
    int pos; 
    void run() { //실행 블럭이 있다 
        ++pos;
    }
    //미완성 코드 
    abstract void stop(); //실행 블럭이 없다 >> 추상 함수 >> 반드시 재정의해서 사용    
}

class Child extends AbClass {
    @Override //재정의 반드시!!!!!!//
    void stop() {
        this.pos = -1;
        System.out.println("stop : " +this.pos);
    }
}


public class Ex01_abstract_class {

    public static void main(String[] args) {
        Child ch = new Child();
        ch.run();
        ch.run();
        System.out.println(ch.pos);
        ch.stop();
        
        //다형성
        AbClass ab = ch;
        //부모타입의 참조 변수는 자식타입 객체의 주소를 가질 수 있다 (다형성) 
        //단 부모는 자기타입의 자원만 볼 수 있다 
        
        ab.run();
        ab.stop(); //재정의 
        //부모 타입 접근 >> 추상 함수 실행 안됨 >> 재정의 (자식)함수 호출 (예외적으로)
    }
}
