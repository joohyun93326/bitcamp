/*
 * 설계도 2개 예제
 */

//설계도 1. Tv
class Tv {
    boolean power; 
    int ch;
    
    void power() {
        this.power = !this.power; //boolean으로 default가 false니까 !this.power      
    }
    
    void chUp() {
        this.ch++;
    }
    void chDown() {
        this.ch--;
    }
}
//설계도 2. Vcr
class Vcr { //비디오 플레이어
    boolean power;
    void power() {
        this.power = !this.power;
    }
    void play() {
        System.out.println("재생하기");     
    }
    void stop() {
        System.out.println("정지하기");        
    }
    void rew() {
        
    }
    void ff() {
        
    }
}
/*
 * Tv설계도
 * Vcr설계도
 * 
 * TvVcr이라는 제품
 * 
 * 1. class TvVcr extends Tv, Vcr >>다중 상속 금지
 * 2. class Tv extends Vcr ... TvVcr extends Tv >> 계층 상속도 안되는 상황 (자원 이름 충돌)
 * --> 해결 : 하나는 상속, 하나는 포함 
 * 
 * >> TV가 메인 기능이니까 Tv를 상속하고, Vcr은 포함해라.
 * >> class TvVcr extends Vcr { Tv tv }
 * 
 */

class TvVcr extends Tv {
    Vcr vcr; //포함   
    TvVcr() {
        vcr = new Vcr(); //tv만들 때 vcr도 껴서 만들어라
    }
}

public class Ex03_Inherit {

    public static void main(String[] args) {
        TvVcr t = new TvVcr();
        t.power(); //tv power
        System.out.println("TV 전원 : " +t.power);
        t.chUp();
        System.out.println("채널 : " +t.ch);
        
        //비디오
        t.vcr.power(); //vcr power
        System.out.println("비디오 전원 : " +t.vcr.power);
        t.vcr.play();
        t.vcr.stop();
        
        t.power();
        t.vcr.power();
        System.out.println("TV 전원 : " +t.power);
        System.out.println("비디오 전원 : " +t.vcr.power);

    }

}
