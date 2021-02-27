//게임 : unit()
//Unit : 공통 기능 (이동 좌표, 이동, 멈춘다) : 추상화, 일반화 
//Unit : 이동 방법 다르다 (이동 방법은 Unit 마다 별도의 구현) 
//추상클래스

abstract class Unit {
    int x, y;
    
    void stop() { //{} 실행 블럭이 있는 완성된 코드 
        System.out.println("Unit stop");
    }
    abstract void move(int x, int y); //미완성 코드 //추상자원 //강제구현
}

//Tank
class Tank extends Unit {
    @Override
    void move(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Tank 이동 : " + this.x + " , " + this.y);
    }
    //Tank 특수화, 구체화
    void changeMode() {
        System.out.println("탱크 변환 모드");
    }
}

class Marine extends Unit {
    @Override
    void move(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Marine 이동 : " + this.x + " , " + this.y);      
    }
    
    //Marine 특수화, 구체화
    void stimpack() {
        System.out.println("스팀팩 기능");
    }
}

class DropShip extends Unit {
    @Override
    void move(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("DropShip 이동 : " + this.x + " , " + this.y);      
    }
    //DropShip 특수화, 구체화
    void load() {
        System.out.println("Unit Load..");
    }
    void unload() {
        System.out.println("Unit unload..");
    }
}

public class Ex02_abstract_class {

    public static void main(String[] args) {
        Tank t = new Tank();
        t.move(500,200);
        t.stop();
        t.changeMode();
        
        Marine m = new Marine();
        m.move(200, 300);
        m.stop();
        m.stimpack();
        
        //문제
        //1. 탱크 3대를 한 번에 만들고 [같은 좌표]로 이동 시키세요 (555,444)
        //>>연속적으로 나오는 같은 타입 >> 배열 
        Tank[] tankarr = {new Tank(), new Tank(), new Tank()};
            for(Tank tank : tankarr) {
                tank.move(555, 444);
            }
        

        //2. 탱크 1, 마린 1, 드랍쉽 1, [같은 좌표]로 이동 시키세요 (666,444)
        //다형성 !!! Unit(부모타입) Tank, Marine, DropShip(자식타입) 주소를 가질 수 있다 
        Unit[] unitarr = {new Tank(), new Marine(), new DropShip()};
            for(Unit unit : unitarr) {
                unit.move(666, 444);
            }
    }

}

