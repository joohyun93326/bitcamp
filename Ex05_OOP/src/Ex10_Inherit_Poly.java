/*
 * 다형성 
 * - [상속관계]에서 [하나의 참조 변수]가 [여러 개의 타입]을 가질 수 있다
 * 
 * [하나의 참조변수] >> 부모타입
 * 부모클래스 타입의 참조 변수가 여러 개의 자식클래스 객체를 담을 수 있다
 * 
 * *** 상속 관계에서 [부모 타입]은 [자식 타입]의 [주소]를 가질 수 있다. ***
 * 
 */

class Tv2 {
    boolean power;
    int ch;
    
    void power() {
        this.power = !this.power;
    }
    void chUp() {
        this.ch++;
    }
    void chDown() {
        this.ch--;
    }
}

class CapTv extends Tv2 { //자막이 있는 Tv
    //CapTv의 특수화, 구체화된 자원 >> 자막 기능 
    String text;
    
    String captionText() {
        return this.text = "현재 자막 처리 중..";
    }
}

public class Ex10_Inherit_Poly {

    public static void main(String[] args) {
        CapTv captv = new CapTv();
        captv.power(); 
        System.out.println("전원 : " + captv.power);
        
        captv.chUp();
        System.out.println("채널 : " + captv.ch);
        System.out.println(captv.captionText());
        //기존 배운 내용
        
        Tv2 tv2 = captv;
        //*** 상속 관계에서 부모 타입은 자식 타입의 주소를 가질 수 있다. ***//
        //단, 부모는 자신의 자원만 접근할 수 있다 (재정의 제외..)
        
        System.out.println(tv2.toString()); //CapTv@555590
        System.out.println(captv.toString()); //CapTv@555590
        //주소값이 동일
        
        //tv2.captionText();
        //자식 타입에는 접근 불가함
        tv2.power(); //내 것은 접근 가능 
        
    }
}

